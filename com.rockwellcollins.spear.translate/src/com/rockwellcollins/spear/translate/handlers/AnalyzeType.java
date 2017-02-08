package com.rockwellcollins.spear.translate.handlers;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.text.TextSelection;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.handlers.HandlerUtil;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.diagnostics.Severity;
import org.eclipse.xtext.resource.EObjectAtOffsetHelper;
import org.eclipse.xtext.ui.editor.XtextEditor;
import org.eclipse.xtext.ui.editor.utils.EditorUtils;
import org.eclipse.xtext.util.CancelIndicator;
import org.eclipse.xtext.validation.CheckMode;
import org.eclipse.xtext.validation.IResourceValidator;
import org.eclipse.xtext.validation.Issue;

import com.google.inject.Injector;
import com.rockwellcollins.spear.TypeDef;
import com.rockwellcollins.spear.translate.intermediate.PatternDocument;
import com.rockwellcollins.spear.translate.intermediate.TypeDocument;
import com.rockwellcollins.spear.translate.master.SProgram;
import com.rockwellcollins.spear.translate.views.SpearConsistencyResultsView;
import com.rockwellcollins.spear.ui.preferences.PreferencesUtil;
import com.rockwellcollins.ui.internal.SpearActivator;

import jkind.api.JKindApi;
import jkind.api.results.JKindResult;
import jkind.lustre.Program;
import jkind.results.layout.Layout;
import jkind.results.layout.NodeLayout;

public class AnalyzeType extends AbstractHandler {

	private IWorkbenchWindow window;

	@Override
	public Object execute(ExecutionEvent event) throws ExecutionException {
		XtextEditor xtextEditor = EditorUtils.getActiveXtextEditor();
		this.window = HandlerUtil.getActiveWorkbenchWindow(event);
		TextSelection ts = (TextSelection) xtextEditor.getSelectionProvider().getSelection();

		xtextEditor.getDocument().readOnly(resource -> {
			EObject e = new EObjectAtOffsetHelper().resolveContainedElementAt(resource, ts.getOffset());
			
			TypeDef td = EcoreUtil2.getContainerOfType(e, TypeDef.class);
			if(td == null) {
				MessageDialog.openError(window.getShell(), "Type definition not found", "Please place the cursor inside a valid type definition.");
				return null;
			}
			
			if(hasErrors(resource)) {
				MessageDialog.openError(window.getShell(), "Error", "Type definition has errors.");
				return null;
			}
			
			analyzeType(td);
			return null;
		});
		return null;
	}

	protected boolean hasErrors(Resource res) {
		Injector injector = SpearActivator.getInstance().getInjector(SpearActivator.COM_ROCKWELLCOLLINS_SPEAR);
		IResourceValidator resourceValidator = injector.getInstance(IResourceValidator.class);

		for (Issue issue : resourceValidator.validate(res, CheckMode.ALL, CancelIndicator.NullImpl)) {
			if (issue.getSeverity() == Severity.ERROR) {
				return true;
			}
		}
		return false;
	}
	
	private void analyzeType(TypeDef td) {
		TypeDocument document = new TypeDocument(td);

		try {
			document.transform();
		} catch (Exception e1) {
			System.err.println("Unexpected error transforming PatternDocument for analysis.");
			e1.printStackTrace();
		} 
		
		PatternDocument pd = document.toPatternDocument();
		
		SProgram p = SProgram.build(pd);
		Program lp = p.patternToLustre();
		
		JKindApi api = PreferencesUtil.getJKindApi();
		JKindResult result = new JKindResult("result");
		lp.getMainNode().properties.stream().forEach(prop -> result.addProperty(prop, true));
		IProgressMonitor monitor = new NullProgressMonitor();
		String nicename = "Pattern Analysis: " + td.getName();
		showView(result, new NodeLayout(lp.getMainNode()), nicename);
		
		try {
			api.execute(lp, result, monitor);
		} catch (Exception e) {
			System.out.println(result.getText());
			throw e;
		}		
	}
	
	private void showView(final JKindResult result, final Layout layout, String title) {
		window.getShell().getDisplay().syncExec(new Runnable() {
			@Override
			public void run() {
				try {
					SpearConsistencyResultsView page = (SpearConsistencyResultsView) window.getActivePage().showView(SpearConsistencyResultsView.ID);
					page.setInput(result, layout, title);
				} catch (PartInitException e) {
					e.printStackTrace();
				}
			}
		});
	}
}