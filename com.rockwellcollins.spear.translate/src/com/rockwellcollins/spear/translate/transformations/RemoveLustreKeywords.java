package com.rockwellcollins.spear.translate.transformations;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import com.rockwellcollins.spear.Specification;
import com.rockwellcollins.spear.translate.lustre.LustreUtilities;
import com.rockwellcollins.spear.util.SpearSwitch;

public class RemoveLustreKeywords extends SpearSwitch<EObject> {

	public static Specification transform(Specification s) {
		new RemoveLustreKeywords().doSwitch(s);
		return s;
	}
	
	private final Set<String> keywords;
	
	public RemoveLustreKeywords() {
		keywords = LustreUtilities.getLustreKeywordSet();
	}
	
	private boolean checkForConflict(String name) {
		for(String keyword : keywords) {
			if(name.startsWith(keyword)) {
				return true;
			}
		}
		return false;
	}
	
	private String makeNameUnique(String original) {
		return original + "_";
	}
	
	private List<String> processNames(EObject root) {
		List<String> renamed = new ArrayList<>();
		
		SimpleAttributeResolver<EObject, String> resolver = SimpleAttributeResolver.newResolver(String.class,"name");
		for (EObject e : EcoreUtil2.getAllContentsOfType(root, EObject.class)) {
			String name = resolver.apply(e);
			if (name != null) {
				if (checkForConflict(name)) {
					String uniqueName = makeNameUnique(name);
					renamed.add(uniqueName);
					e.eSet(resolver.getAttribute(e), uniqueName);
				}
			}
		}
		return renamed;
	}
	
	@Override
	public Specification caseSpecification(Specification s) {
		this.processNames(s);
		return s;
	}
	
	@Override
	public EObject defaultCase(EObject o) {
		throw new RuntimeException("Expected a specification but received a " + o);
	}
}
