/*
 * generated by Xtext
 */
package com.rockwellcollins.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import com.rockwellcollins.services.SpearGrammarAccess;

public class SpearParser extends AbstractContentAssistParser {
	
	@Inject
	private SpearGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected com.rockwellcollins.ui.contentassist.antlr.internal.InternalSpearParser createParser() {
		com.rockwellcollins.ui.contentassist.antlr.internal.InternalSpearParser result = new com.rockwellcollins.ui.contentassist.antlr.internal.InternalSpearParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getFileAccess().getAlternatives(), "rule__File__Alternatives");
					put(grammarAccess.getAssumptionsHeaderAccess().getAlternatives(), "rule__AssumptionsHeader__Alternatives");
					put(grammarAccess.getRequirementsHeaderAccess().getAlternatives(), "rule__RequirementsHeader__Alternatives");
					put(grammarAccess.getPropertiesHeaderAccess().getAlternatives(), "rule__PropertiesHeader__Alternatives");
					put(grammarAccess.getPatternAccess().getAlternatives_11(), "rule__Pattern__Alternatives_11");
					put(grammarAccess.getLustreEquationAccess().getAlternatives(), "rule__LustreEquation__Alternatives");
					put(grammarAccess.getUnitDefAccess().getAlternatives(), "rule__UnitDef__Alternatives");
					put(grammarAccess.getAtomicUnitExprAccess().getAlternatives(), "rule__AtomicUnitExpr__Alternatives");
					put(grammarAccess.getTypeDefAccess().getAlternatives(), "rule__TypeDef__Alternatives");
					put(grammarAccess.getTypeAccess().getAlternatives(), "rule__Type__Alternatives");
					put(grammarAccess.getIdTypeDelimiterAccess().getAlternatives(), "rule__IdTypeDelimiter__Alternatives");
					put(grammarAccess.getConstraintAccess().getAlternatives(), "rule__Constraint__Alternatives");
					put(grammarAccess.getWhileExprAccess().getAlternatives(), "rule__WhileExpr__Alternatives");
					put(grammarAccess.getImpliesExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__ImpliesExpr__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getOrExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__OrExpr__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getAfterUntilExprAccess().getAlternatives(), "rule__AfterUntilExpr__Alternatives");
					put(grammarAccess.getTriggersExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__TriggersExpr__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getSinceExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__SinceExpr__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getTemporalPrefixExprAccess().getAlternatives(), "rule__TemporalPrefixExpr__Alternatives");
					put(grammarAccess.getTemporalPrefixExprAccess().getOpAlternatives_0_1_0(), "rule__TemporalPrefixExpr__OpAlternatives_0_1_0");
					put(grammarAccess.getRelationalOpAccess().getAlternatives(), "rule__RelationalOp__Alternatives");
					put(grammarAccess.getPlusExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__PlusExpr__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getMultiplyExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__MultiplyExpr__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getArrowExprAccess().getOpAlternatives_1_0_0_1_0(), "rule__ArrowExpr__OpAlternatives_1_0_0_1_0");
					put(grammarAccess.getPrefixExprAccess().getAlternatives(), "rule__PrefixExpr__Alternatives");
					put(grammarAccess.getPrefixExprAccess().getOpAlternatives_0_1_0(), "rule__PrefixExpr__OpAlternatives_0_1_0");
					put(grammarAccess.getAccessExprAccess().getAlternatives_1(), "rule__AccessExpr__Alternatives_1");
					put(grammarAccess.getAtomicExprAccess().getAlternatives(), "rule__AtomicExpr__Alternatives");
					put(grammarAccess.getLiteralExprAccess().getAlternatives(), "rule__LiteralExpr__Alternatives");
					put(grammarAccess.getIdRefAccess().getAlternatives(), "rule__IdRef__Alternatives");
					put(grammarAccess.getBOOLAccess().getAlternatives(), "rule__BOOL__Alternatives");
					put(grammarAccess.getBOOLEAN_TRUEAccess().getAlternatives(), "rule__BOOLEAN_TRUE__Alternatives");
					put(grammarAccess.getBOOLEAN_FALSEAccess().getAlternatives(), "rule__BOOLEAN_FALSE__Alternatives");
					put(grammarAccess.getSpecificationAccess().getGroup(), "rule__Specification__Group__0");
					put(grammarAccess.getSpecificationAccess().getGroup_2(), "rule__Specification__Group_2__0");
					put(grammarAccess.getSpecificationAccess().getGroup_3(), "rule__Specification__Group_3__0");
					put(grammarAccess.getSpecificationAccess().getGroup_4(), "rule__Specification__Group_4__0");
					put(grammarAccess.getSpecificationAccess().getGroup_5(), "rule__Specification__Group_5__0");
					put(grammarAccess.getSpecificationAccess().getGroup_6(), "rule__Specification__Group_6__0");
					put(grammarAccess.getSpecificationAccess().getGroup_11(), "rule__Specification__Group_11__0");
					put(grammarAccess.getSpecificationAccess().getGroup_12(), "rule__Specification__Group_12__0");
					put(grammarAccess.getSpecificationAccess().getGroup_13(), "rule__Specification__Group_13__0");
					put(grammarAccess.getSpecificationAccess().getGroup_17(), "rule__Specification__Group_17__0");
					put(grammarAccess.getImportAccess().getGroup(), "rule__Import__Group__0");
					put(grammarAccess.getDefinitionsAccess().getGroup(), "rule__Definitions__Group__0");
					put(grammarAccess.getDefinitionsAccess().getGroup_2(), "rule__Definitions__Group_2__0");
					put(grammarAccess.getDefinitionsAccess().getGroup_3(), "rule__Definitions__Group_3__0");
					put(grammarAccess.getDefinitionsAccess().getGroup_4(), "rule__Definitions__Group_4__0");
					put(grammarAccess.getDefinitionsAccess().getGroup_5(), "rule__Definitions__Group_5__0");
					put(grammarAccess.getDefinitionsAccess().getGroup_6(), "rule__Definitions__Group_6__0");
					put(grammarAccess.getPatternAccess().getGroup(), "rule__Pattern__Group__0");
					put(grammarAccess.getPatternAccess().getGroup_3(), "rule__Pattern__Group_3__0");
					put(grammarAccess.getPatternAccess().getGroup_3_1(), "rule__Pattern__Group_3_1__0");
					put(grammarAccess.getPatternAccess().getGroup_7(), "rule__Pattern__Group_7__0");
					put(grammarAccess.getPatternAccess().getGroup_7_1(), "rule__Pattern__Group_7_1__0");
					put(grammarAccess.getPatternAccess().getGroup_9(), "rule__Pattern__Group_9__0");
					put(grammarAccess.getLustreEquationAccess().getGroup_0(), "rule__LustreEquation__Group_0__0");
					put(grammarAccess.getLustreEquationAccess().getGroup_0_2(), "rule__LustreEquation__Group_0_2__0");
					put(grammarAccess.getLustreEquationAccess().getGroup_1(), "rule__LustreEquation__Group_1__0");
					put(grammarAccess.getLustrePropertyAccess().getGroup(), "rule__LustreProperty__Group__0");
					put(grammarAccess.getLustreAssertionAccess().getGroup(), "rule__LustreAssertion__Group__0");
					put(grammarAccess.getUnitDefAccess().getGroup_0(), "rule__UnitDef__Group_0__0");
					put(grammarAccess.getUnitDefAccess().getGroup_1(), "rule__UnitDef__Group_1__0");
					put(grammarAccess.getProductUnitExprAccess().getGroup(), "rule__ProductUnitExpr__Group__0");
					put(grammarAccess.getProductUnitExprAccess().getGroup_1(), "rule__ProductUnitExpr__Group_1__0");
					put(grammarAccess.getProductUnitExprAccess().getGroup_1_0(), "rule__ProductUnitExpr__Group_1_0__0");
					put(grammarAccess.getProductUnitExprAccess().getGroup_1_0_0(), "rule__ProductUnitExpr__Group_1_0_0__0");
					put(grammarAccess.getDivisionUnitExprAccess().getGroup(), "rule__DivisionUnitExpr__Group__0");
					put(grammarAccess.getDivisionUnitExprAccess().getGroup_1(), "rule__DivisionUnitExpr__Group_1__0");
					put(grammarAccess.getDivisionUnitExprAccess().getGroup_1_0(), "rule__DivisionUnitExpr__Group_1_0__0");
					put(grammarAccess.getDivisionUnitExprAccess().getGroup_1_0_0(), "rule__DivisionUnitExpr__Group_1_0_0__0");
					put(grammarAccess.getAtomicUnitExprAccess().getGroup_0(), "rule__AtomicUnitExpr__Group_0__0");
					put(grammarAccess.getAtomicUnitExprAccess().getGroup_1(), "rule__AtomicUnitExpr__Group_1__0");
					put(grammarAccess.getTypeDefAccess().getGroup_0(), "rule__TypeDef__Group_0__0");
					put(grammarAccess.getTypeDefAccess().getGroup_1(), "rule__TypeDef__Group_1__0");
					put(grammarAccess.getTypeDefAccess().getGroup_2(), "rule__TypeDef__Group_2__0");
					put(grammarAccess.getTypeDefAccess().getGroup_2_6(), "rule__TypeDef__Group_2_6__0");
					put(grammarAccess.getTypeDefAccess().getGroup_3(), "rule__TypeDef__Group_3__0");
					put(grammarAccess.getTypeDefAccess().getGroup_4(), "rule__TypeDef__Group_4__0");
					put(grammarAccess.getTypeDefAccess().getGroup_4_6(), "rule__TypeDef__Group_4_6__0");
					put(grammarAccess.getUnusedTypeDefAccess().getGroup(), "rule__UnusedTypeDef__Group__0");
					put(grammarAccess.getFieldTypeAccess().getGroup(), "rule__FieldType__Group__0");
					put(grammarAccess.getTypeAccess().getGroup_0(), "rule__Type__Group_0__0");
					put(grammarAccess.getTypeAccess().getGroup_1(), "rule__Type__Group_1__0");
					put(grammarAccess.getTypeAccess().getGroup_2(), "rule__Type__Group_2__0");
					put(grammarAccess.getTypeAccess().getGroup_3(), "rule__Type__Group_3__0");
					put(grammarAccess.getConstantAccess().getGroup(), "rule__Constant__Group__0");
					put(grammarAccess.getConstantAccess().getGroup_5(), "rule__Constant__Group_5__0");
					put(grammarAccess.getVariableAccess().getGroup(), "rule__Variable__Group__0");
					put(grammarAccess.getMacroAccess().getGroup(), "rule__Macro__Group__0");
					put(grammarAccess.getMacroAccess().getGroup_5(), "rule__Macro__Group_5__0");
					put(grammarAccess.getFormalConstraintAccess().getGroup(), "rule__FormalConstraint__Group__0");
					put(grammarAccess.getFormalConstraintAccess().getGroup_3(), "rule__FormalConstraint__Group_3__0");
					put(grammarAccess.getFormalConstraintAccess().getGroup_4(), "rule__FormalConstraint__Group_4__0");
					put(grammarAccess.getFormalConstraintAccess().getGroup_4_4(), "rule__FormalConstraint__Group_4_4__0");
					put(grammarAccess.getEnglishConstraintAccess().getGroup(), "rule__EnglishConstraint__Group__0");
					put(grammarAccess.getEnglishConstraintAccess().getGroup_3(), "rule__EnglishConstraint__Group_3__0");
					put(grammarAccess.getEnglishConstraintAccess().getGroup_3_4(), "rule__EnglishConstraint__Group_3_4__0");
					put(grammarAccess.getWhileExprAccess().getGroup_0(), "rule__WhileExpr__Group_0__0");
					put(grammarAccess.getImpliesExprAccess().getGroup(), "rule__ImpliesExpr__Group__0");
					put(grammarAccess.getImpliesExprAccess().getGroup_1(), "rule__ImpliesExpr__Group_1__0");
					put(grammarAccess.getImpliesExprAccess().getGroup_1_0(), "rule__ImpliesExpr__Group_1_0__0");
					put(grammarAccess.getImpliesExprAccess().getGroup_1_0_0(), "rule__ImpliesExpr__Group_1_0_0__0");
					put(grammarAccess.getOrExprAccess().getGroup(), "rule__OrExpr__Group__0");
					put(grammarAccess.getOrExprAccess().getGroup_1(), "rule__OrExpr__Group_1__0");
					put(grammarAccess.getOrExprAccess().getGroup_1_0(), "rule__OrExpr__Group_1_0__0");
					put(grammarAccess.getOrExprAccess().getGroup_1_0_0(), "rule__OrExpr__Group_1_0_0__0");
					put(grammarAccess.getAndExprAccess().getGroup(), "rule__AndExpr__Group__0");
					put(grammarAccess.getAndExprAccess().getGroup_1(), "rule__AndExpr__Group_1__0");
					put(grammarAccess.getAndExprAccess().getGroup_1_0(), "rule__AndExpr__Group_1_0__0");
					put(grammarAccess.getAndExprAccess().getGroup_1_0_0(), "rule__AndExpr__Group_1_0_0__0");
					put(grammarAccess.getAfterUntilExprAccess().getGroup_0(), "rule__AfterUntilExpr__Group_0__0");
					put(grammarAccess.getAfterUntilExprAccess().getGroup_0_3(), "rule__AfterUntilExpr__Group_0_3__0");
					put(grammarAccess.getTriggersExprAccess().getGroup(), "rule__TriggersExpr__Group__0");
					put(grammarAccess.getTriggersExprAccess().getGroup_1(), "rule__TriggersExpr__Group_1__0");
					put(grammarAccess.getTriggersExprAccess().getGroup_1_0(), "rule__TriggersExpr__Group_1_0__0");
					put(grammarAccess.getTriggersExprAccess().getGroup_1_0_0(), "rule__TriggersExpr__Group_1_0_0__0");
					put(grammarAccess.getSinceExprAccess().getGroup(), "rule__SinceExpr__Group__0");
					put(grammarAccess.getSinceExprAccess().getGroup_1(), "rule__SinceExpr__Group_1__0");
					put(grammarAccess.getSinceExprAccess().getGroup_1_0(), "rule__SinceExpr__Group_1_0__0");
					put(grammarAccess.getSinceExprAccess().getGroup_1_0_0(), "rule__SinceExpr__Group_1_0_0__0");
					put(grammarAccess.getTemporalPrefixExprAccess().getGroup_0(), "rule__TemporalPrefixExpr__Group_0__0");
					put(grammarAccess.getRelationalExprAccess().getGroup(), "rule__RelationalExpr__Group__0");
					put(grammarAccess.getRelationalExprAccess().getGroup_1(), "rule__RelationalExpr__Group_1__0");
					put(grammarAccess.getRelationalExprAccess().getGroup_1_0(), "rule__RelationalExpr__Group_1_0__0");
					put(grammarAccess.getRelationalExprAccess().getGroup_1_0_0(), "rule__RelationalExpr__Group_1_0_0__0");
					put(grammarAccess.getRelationalOpAccess().getGroup_1(), "rule__RelationalOp__Group_1__0");
					put(grammarAccess.getRelationalOpAccess().getGroup_3(), "rule__RelationalOp__Group_3__0");
					put(grammarAccess.getRelationalOpAccess().getGroup_5(), "rule__RelationalOp__Group_5__0");
					put(grammarAccess.getRelationalOpAccess().getGroup_7(), "rule__RelationalOp__Group_7__0");
					put(grammarAccess.getRelationalOpAccess().getGroup_9(), "rule__RelationalOp__Group_9__0");
					put(grammarAccess.getRelationalOpAccess().getGroup_11(), "rule__RelationalOp__Group_11__0");
					put(grammarAccess.getPlusExprAccess().getGroup(), "rule__PlusExpr__Group__0");
					put(grammarAccess.getPlusExprAccess().getGroup_1(), "rule__PlusExpr__Group_1__0");
					put(grammarAccess.getPlusExprAccess().getGroup_1_0(), "rule__PlusExpr__Group_1_0__0");
					put(grammarAccess.getPlusExprAccess().getGroup_1_0_0(), "rule__PlusExpr__Group_1_0_0__0");
					put(grammarAccess.getMultiplyExprAccess().getGroup(), "rule__MultiplyExpr__Group__0");
					put(grammarAccess.getMultiplyExprAccess().getGroup_1(), "rule__MultiplyExpr__Group_1__0");
					put(grammarAccess.getMultiplyExprAccess().getGroup_1_0(), "rule__MultiplyExpr__Group_1_0__0");
					put(grammarAccess.getMultiplyExprAccess().getGroup_1_0_0(), "rule__MultiplyExpr__Group_1_0_0__0");
					put(grammarAccess.getArrowExprAccess().getGroup(), "rule__ArrowExpr__Group__0");
					put(grammarAccess.getArrowExprAccess().getGroup_1(), "rule__ArrowExpr__Group_1__0");
					put(grammarAccess.getArrowExprAccess().getGroup_1_0(), "rule__ArrowExpr__Group_1_0__0");
					put(grammarAccess.getArrowExprAccess().getGroup_1_0_0(), "rule__ArrowExpr__Group_1_0_0__0");
					put(grammarAccess.getPrefixExprAccess().getGroup_0(), "rule__PrefixExpr__Group_0__0");
					put(grammarAccess.getPrefixExprAccess().getGroup_1(), "rule__PrefixExpr__Group_1__0");
					put(grammarAccess.getPrefixExprAccess().getGroup_1_3(), "rule__PrefixExpr__Group_1_3__0");
					put(grammarAccess.getAccessExprAccess().getGroup(), "rule__AccessExpr__Group__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_0(), "rule__AccessExpr__Group_1_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_0_0(), "rule__AccessExpr__Group_1_0_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_0_0_0(), "rule__AccessExpr__Group_1_0_0_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_1(), "rule__AccessExpr__Group_1_1__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_1_0(), "rule__AccessExpr__Group_1_1_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_1_0_0(), "rule__AccessExpr__Group_1_1_0_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_2(), "rule__AccessExpr__Group_1_2__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_2_0(), "rule__AccessExpr__Group_1_2_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_2_0_0(), "rule__AccessExpr__Group_1_2_0_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_2_2(), "rule__AccessExpr__Group_1_2_2__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_2_2_0(), "rule__AccessExpr__Group_1_2_2_0__0");
					put(grammarAccess.getAccessExprAccess().getGroup_1_2_2_0_0(), "rule__AccessExpr__Group_1_2_2_0_0__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_1(), "rule__AtomicExpr__Group_1__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_2(), "rule__AtomicExpr__Group_2__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_2_3(), "rule__AtomicExpr__Group_2_3__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_3(), "rule__AtomicExpr__Group_3__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_3_5(), "rule__AtomicExpr__Group_3_5__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_4(), "rule__AtomicExpr__Group_4__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_4_5(), "rule__AtomicExpr__Group_4_5__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_5(), "rule__AtomicExpr__Group_5__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_5_5(), "rule__AtomicExpr__Group_5_5__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_6(), "rule__AtomicExpr__Group_6__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_6_5(), "rule__AtomicExpr__Group_6_5__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_7(), "rule__AtomicExpr__Group_7__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_7_3(), "rule__AtomicExpr__Group_7_3__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_7_3_1(), "rule__AtomicExpr__Group_7_3_1__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_8(), "rule__AtomicExpr__Group_8__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_8_4(), "rule__AtomicExpr__Group_8_4__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_8_4_1(), "rule__AtomicExpr__Group_8_4_1__0");
					put(grammarAccess.getAtomicExprAccess().getGroup_10(), "rule__AtomicExpr__Group_10__0");
					put(grammarAccess.getLiteralExprAccess().getGroup_0(), "rule__LiteralExpr__Group_0__0");
					put(grammarAccess.getLiteralExprAccess().getGroup_1(), "rule__LiteralExpr__Group_1__0");
					put(grammarAccess.getLiteralExprAccess().getGroup_2(), "rule__LiteralExpr__Group_2__0");
					put(grammarAccess.getUnusedExprAccess().getGroup(), "rule__UnusedExpr__Group__0");
					put(grammarAccess.getUnusedExprAccess().getGroup_3(), "rule__UnusedExpr__Group_3__0");
					put(grammarAccess.getUnusedExprAccess().getGroup_10(), "rule__UnusedExpr__Group_10__0");
					put(grammarAccess.getFieldExprAccess().getGroup(), "rule__FieldExpr__Group__0");
					put(grammarAccess.getREALAccess().getGroup(), "rule__REAL__Group__0");
					put(grammarAccess.getSpecificationAccess().getNameAssignment_1(), "rule__Specification__NameAssignment_1");
					put(grammarAccess.getSpecificationAccess().getImportsAssignment_2_1(), "rule__Specification__ImportsAssignment_2_1");
					put(grammarAccess.getSpecificationAccess().getUnitsAssignment_3_1(), "rule__Specification__UnitsAssignment_3_1");
					put(grammarAccess.getSpecificationAccess().getTypedefsAssignment_4_1(), "rule__Specification__TypedefsAssignment_4_1");
					put(grammarAccess.getSpecificationAccess().getConstantsAssignment_5_1(), "rule__Specification__ConstantsAssignment_5_1");
					put(grammarAccess.getSpecificationAccess().getPatternsAssignment_6_1(), "rule__Specification__PatternsAssignment_6_1");
					put(grammarAccess.getSpecificationAccess().getInputsAssignment_8(), "rule__Specification__InputsAssignment_8");
					put(grammarAccess.getSpecificationAccess().getOutputsAssignment_10(), "rule__Specification__OutputsAssignment_10");
					put(grammarAccess.getSpecificationAccess().getStateAssignment_11_1(), "rule__Specification__StateAssignment_11_1");
					put(grammarAccess.getSpecificationAccess().getMacrosAssignment_12_1(), "rule__Specification__MacrosAssignment_12_1");
					put(grammarAccess.getSpecificationAccess().getAssumptionsKeywordAssignment_13_0(), "rule__Specification__AssumptionsKeywordAssignment_13_0");
					put(grammarAccess.getSpecificationAccess().getAssumptionsAssignment_13_2(), "rule__Specification__AssumptionsAssignment_13_2");
					put(grammarAccess.getSpecificationAccess().getRequirementsKeywordAssignment_14(), "rule__Specification__RequirementsKeywordAssignment_14");
					put(grammarAccess.getSpecificationAccess().getRequirementsAssignment_16(), "rule__Specification__RequirementsAssignment_16");
					put(grammarAccess.getSpecificationAccess().getPropertiesKeywordAssignment_17_0(), "rule__Specification__PropertiesKeywordAssignment_17_0");
					put(grammarAccess.getSpecificationAccess().getBehaviorsAssignment_17_2(), "rule__Specification__BehaviorsAssignment_17_2");
					put(grammarAccess.getImportAccess().getImportURIAssignment_1(), "rule__Import__ImportURIAssignment_1");
					put(grammarAccess.getDefinitionsAccess().getNameAssignment_1(), "rule__Definitions__NameAssignment_1");
					put(grammarAccess.getDefinitionsAccess().getImportsAssignment_2_1(), "rule__Definitions__ImportsAssignment_2_1");
					put(grammarAccess.getDefinitionsAccess().getUnitdefsAssignment_3_1(), "rule__Definitions__UnitdefsAssignment_3_1");
					put(grammarAccess.getDefinitionsAccess().getTypedefsAssignment_4_1(), "rule__Definitions__TypedefsAssignment_4_1");
					put(grammarAccess.getDefinitionsAccess().getConstantsAssignment_5_1(), "rule__Definitions__ConstantsAssignment_5_1");
					put(grammarAccess.getDefinitionsAccess().getPatternsAssignment_6_1(), "rule__Definitions__PatternsAssignment_6_1");
					put(grammarAccess.getPatternAccess().getNameAssignment_1(), "rule__Pattern__NameAssignment_1");
					put(grammarAccess.getPatternAccess().getInputsAssignment_3_0(), "rule__Pattern__InputsAssignment_3_0");
					put(grammarAccess.getPatternAccess().getInputsAssignment_3_1_1(), "rule__Pattern__InputsAssignment_3_1_1");
					put(grammarAccess.getPatternAccess().getOutputsAssignment_7_0(), "rule__Pattern__OutputsAssignment_7_0");
					put(grammarAccess.getPatternAccess().getOutputsAssignment_7_1_1(), "rule__Pattern__OutputsAssignment_7_1_1");
					put(grammarAccess.getPatternAccess().getLocalsAssignment_9_1(), "rule__Pattern__LocalsAssignment_9_1");
					put(grammarAccess.getPatternAccess().getEquationsAssignment_11_0(), "rule__Pattern__EquationsAssignment_11_0");
					put(grammarAccess.getPatternAccess().getPropertiesAssignment_11_1(), "rule__Pattern__PropertiesAssignment_11_1");
					put(grammarAccess.getPatternAccess().getAssertionsAssignment_11_2(), "rule__Pattern__AssertionsAssignment_11_2");
					put(grammarAccess.getLustreEquationAccess().getIdsAssignment_0_1(), "rule__LustreEquation__IdsAssignment_0_1");
					put(grammarAccess.getLustreEquationAccess().getIdsAssignment_0_2_1(), "rule__LustreEquation__IdsAssignment_0_2_1");
					put(grammarAccess.getLustreEquationAccess().getRhsAssignment_0_5(), "rule__LustreEquation__RhsAssignment_0_5");
					put(grammarAccess.getLustreEquationAccess().getIdsAssignment_1_0(), "rule__LustreEquation__IdsAssignment_1_0");
					put(grammarAccess.getLustreEquationAccess().getRhsAssignment_1_2(), "rule__LustreEquation__RhsAssignment_1_2");
					put(grammarAccess.getLustrePropertyAccess().getPropertyIdAssignment_1(), "rule__LustreProperty__PropertyIdAssignment_1");
					put(grammarAccess.getLustreAssertionAccess().getAssertionExprAssignment_1(), "rule__LustreAssertion__AssertionExprAssignment_1");
					put(grammarAccess.getUnitDefAccess().getNameAssignment_0_1(), "rule__UnitDef__NameAssignment_0_1");
					put(grammarAccess.getUnitDefAccess().getDescriptionAssignment_0_2(), "rule__UnitDef__DescriptionAssignment_0_2");
					put(grammarAccess.getUnitDefAccess().getNameAssignment_1_1(), "rule__UnitDef__NameAssignment_1_1");
					put(grammarAccess.getUnitDefAccess().getUnitAssignment_1_3(), "rule__UnitDef__UnitAssignment_1_3");
					put(grammarAccess.getUnitDefAccess().getDescriptionAssignment_1_4(), "rule__UnitDef__DescriptionAssignment_1_4");
					put(grammarAccess.getProductUnitExprAccess().getOpAssignment_1_0_0_1(), "rule__ProductUnitExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getProductUnitExprAccess().getRightAssignment_1_1(), "rule__ProductUnitExpr__RightAssignment_1_1");
					put(grammarAccess.getDivisionUnitExprAccess().getOpAssignment_1_0_0_1(), "rule__DivisionUnitExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getDivisionUnitExprAccess().getRightAssignment_1_1(), "rule__DivisionUnitExpr__RightAssignment_1_1");
					put(grammarAccess.getAtomicUnitExprAccess().getUnitAssignment_0_1(), "rule__AtomicUnitExpr__UnitAssignment_0_1");
					put(grammarAccess.getTypeDefAccess().getNameAssignment_0_1(), "rule__TypeDef__NameAssignment_0_1");
					put(grammarAccess.getTypeDefAccess().getTypeAssignment_0_3(), "rule__TypeDef__TypeAssignment_0_3");
					put(grammarAccess.getTypeDefAccess().getUnitAssignment_0_4(), "rule__TypeDef__UnitAssignment_0_4");
					put(grammarAccess.getTypeDefAccess().getNameAssignment_1_1(), "rule__TypeDef__NameAssignment_1_1");
					put(grammarAccess.getTypeDefAccess().getNameAssignment_2_1(), "rule__TypeDef__NameAssignment_2_1");
					put(grammarAccess.getTypeDefAccess().getFieldsAssignment_2_5(), "rule__TypeDef__FieldsAssignment_2_5");
					put(grammarAccess.getTypeDefAccess().getFieldsAssignment_2_6_1(), "rule__TypeDef__FieldsAssignment_2_6_1");
					put(grammarAccess.getTypeDefAccess().getNameAssignment_3_1(), "rule__TypeDef__NameAssignment_3_1");
					put(grammarAccess.getTypeDefAccess().getBaseAssignment_3_3(), "rule__TypeDef__BaseAssignment_3_3");
					put(grammarAccess.getTypeDefAccess().getSizeAssignment_3_5(), "rule__TypeDef__SizeAssignment_3_5");
					put(grammarAccess.getTypeDefAccess().getNameAssignment_4_1(), "rule__TypeDef__NameAssignment_4_1");
					put(grammarAccess.getTypeDefAccess().getValuesAssignment_4_5(), "rule__TypeDef__ValuesAssignment_4_5");
					put(grammarAccess.getTypeDefAccess().getValuesAssignment_4_6_1(), "rule__TypeDef__ValuesAssignment_4_6_1");
					put(grammarAccess.getUnusedTypeDefAccess().getNameAssignment_1(), "rule__UnusedTypeDef__NameAssignment_1");
					put(grammarAccess.getUnusedTypeDefAccess().getBaseAssignment_3(), "rule__UnusedTypeDef__BaseAssignment_3");
					put(grammarAccess.getUnusedTypeDefAccess().getSizeAssignment_5(), "rule__UnusedTypeDef__SizeAssignment_5");
					put(grammarAccess.getFieldTypeAccess().getNameAssignment_0(), "rule__FieldType__NameAssignment_0");
					put(grammarAccess.getFieldTypeAccess().getTypeAssignment_2(), "rule__FieldType__TypeAssignment_2");
					put(grammarAccess.getEnumValueAccess().getNameAssignment(), "rule__EnumValue__NameAssignment");
					put(grammarAccess.getTypeAccess().getDefAssignment_3_1(), "rule__Type__DefAssignment_3_1");
					put(grammarAccess.getConstantAccess().getNameAssignment_0(), "rule__Constant__NameAssignment_0");
					put(grammarAccess.getConstantAccess().getTypeAssignment_2(), "rule__Constant__TypeAssignment_2");
					put(grammarAccess.getConstantAccess().getExprAssignment_4(), "rule__Constant__ExprAssignment_4");
					put(grammarAccess.getConstantAccess().getDescriptorAssignment_5_2(), "rule__Constant__DescriptorAssignment_5_2");
					put(grammarAccess.getVariableAccess().getNameAssignment_0(), "rule__Variable__NameAssignment_0");
					put(grammarAccess.getVariableAccess().getTypeAssignment_2(), "rule__Variable__TypeAssignment_2");
					put(grammarAccess.getMacroAccess().getNameAssignment_0(), "rule__Macro__NameAssignment_0");
					put(grammarAccess.getMacroAccess().getTypeAssignment_2(), "rule__Macro__TypeAssignment_2");
					put(grammarAccess.getMacroAccess().getExprAssignment_4(), "rule__Macro__ExprAssignment_4");
					put(grammarAccess.getMacroAccess().getDescriptorAssignment_5_2(), "rule__Macro__DescriptorAssignment_5_2");
					put(grammarAccess.getFormalConstraintAccess().getNameAssignment_0(), "rule__FormalConstraint__NameAssignment_0");
					put(grammarAccess.getFormalConstraintAccess().getExprAssignment_2(), "rule__FormalConstraint__ExprAssignment_2");
					put(grammarAccess.getFormalConstraintAccess().getDescriptorAssignment_3_2(), "rule__FormalConstraint__DescriptorAssignment_3_2");
					put(grammarAccess.getFormalConstraintAccess().getIdsAssignment_4_3(), "rule__FormalConstraint__IdsAssignment_4_3");
					put(grammarAccess.getFormalConstraintAccess().getIdsAssignment_4_4_1(), "rule__FormalConstraint__IdsAssignment_4_4_1");
					put(grammarAccess.getEnglishConstraintAccess().getNameAssignment_0(), "rule__EnglishConstraint__NameAssignment_0");
					put(grammarAccess.getEnglishConstraintAccess().getTextAssignment_2(), "rule__EnglishConstraint__TextAssignment_2");
					put(grammarAccess.getEnglishConstraintAccess().getIdsAssignment_3_3(), "rule__EnglishConstraint__IdsAssignment_3_3");
					put(grammarAccess.getEnglishConstraintAccess().getIdsAssignment_3_4_1(), "rule__EnglishConstraint__IdsAssignment_3_4_1");
					put(grammarAccess.getWhileExprAccess().getCondAssignment_0_2(), "rule__WhileExpr__CondAssignment_0_2");
					put(grammarAccess.getWhileExprAccess().getThenAssignment_0_4(), "rule__WhileExpr__ThenAssignment_0_4");
					put(grammarAccess.getImpliesExprAccess().getOpAssignment_1_0_0_1(), "rule__ImpliesExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getImpliesExprAccess().getRightAssignment_1_1(), "rule__ImpliesExpr__RightAssignment_1_1");
					put(grammarAccess.getOrExprAccess().getOpAssignment_1_0_0_1(), "rule__OrExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getOrExprAccess().getRightAssignment_1_1(), "rule__OrExpr__RightAssignment_1_1");
					put(grammarAccess.getAndExprAccess().getOpAssignment_1_0_0_1(), "rule__AndExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getAndExprAccess().getRightAssignment_1_1(), "rule__AndExpr__RightAssignment_1_1");
					put(grammarAccess.getAfterUntilExprAccess().getAfterAssignment_0_2(), "rule__AfterUntilExpr__AfterAssignment_0_2");
					put(grammarAccess.getAfterUntilExprAccess().getUntilAssignment_0_3_1(), "rule__AfterUntilExpr__UntilAssignment_0_3_1");
					put(grammarAccess.getTriggersExprAccess().getOpAssignment_1_0_0_1(), "rule__TriggersExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getTriggersExprAccess().getRightAssignment_1_1(), "rule__TriggersExpr__RightAssignment_1_1");
					put(grammarAccess.getSinceExprAccess().getOpAssignment_1_0_0_1(), "rule__SinceExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getSinceExprAccess().getRightAssignment_1_1(), "rule__SinceExpr__RightAssignment_1_1");
					put(grammarAccess.getTemporalPrefixExprAccess().getOpAssignment_0_1(), "rule__TemporalPrefixExpr__OpAssignment_0_1");
					put(grammarAccess.getTemporalPrefixExprAccess().getExprAssignment_0_2(), "rule__TemporalPrefixExpr__ExprAssignment_0_2");
					put(grammarAccess.getRelationalExprAccess().getOpAssignment_1_0_0_1(), "rule__RelationalExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getRelationalExprAccess().getRightAssignment_1_1(), "rule__RelationalExpr__RightAssignment_1_1");
					put(grammarAccess.getPlusExprAccess().getOpAssignment_1_0_0_1(), "rule__PlusExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getPlusExprAccess().getRightAssignment_1_1(), "rule__PlusExpr__RightAssignment_1_1");
					put(grammarAccess.getMultiplyExprAccess().getOpAssignment_1_0_0_1(), "rule__MultiplyExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getMultiplyExprAccess().getRightAssignment_1_1(), "rule__MultiplyExpr__RightAssignment_1_1");
					put(grammarAccess.getArrowExprAccess().getOpAssignment_1_0_0_1(), "rule__ArrowExpr__OpAssignment_1_0_0_1");
					put(grammarAccess.getArrowExprAccess().getRightAssignment_1_1(), "rule__ArrowExpr__RightAssignment_1_1");
					put(grammarAccess.getPrefixExprAccess().getOpAssignment_0_1(), "rule__PrefixExpr__OpAssignment_0_1");
					put(grammarAccess.getPrefixExprAccess().getExprAssignment_0_2(), "rule__PrefixExpr__ExprAssignment_0_2");
					put(grammarAccess.getPrefixExprAccess().getVarAssignment_1_2(), "rule__PrefixExpr__VarAssignment_1_2");
					put(grammarAccess.getPrefixExprAccess().getInitAssignment_1_3_3(), "rule__PrefixExpr__InitAssignment_1_3_3");
					put(grammarAccess.getAccessExprAccess().getFieldAssignment_1_0_1(), "rule__AccessExpr__FieldAssignment_1_0_1");
					put(grammarAccess.getAccessExprAccess().getFieldAssignment_1_1_0_0_2(), "rule__AccessExpr__FieldAssignment_1_1_0_0_2");
					put(grammarAccess.getAccessExprAccess().getValueAssignment_1_1_1(), "rule__AccessExpr__ValueAssignment_1_1_1");
					put(grammarAccess.getAccessExprAccess().getIndexAssignment_1_2_1(), "rule__AccessExpr__IndexAssignment_1_2_1");
					put(grammarAccess.getAccessExprAccess().getValueAssignment_1_2_2_1(), "rule__AccessExpr__ValueAssignment_1_2_2_1");
					put(grammarAccess.getAtomicExprAccess().getIdAssignment_1_1(), "rule__AtomicExpr__IdAssignment_1_1");
					put(grammarAccess.getAtomicExprAccess().getIdsAssignment_2_2(), "rule__AtomicExpr__IdsAssignment_2_2");
					put(grammarAccess.getAtomicExprAccess().getIdsAssignment_2_3_1(), "rule__AtomicExpr__IdsAssignment_2_3_1");
					put(grammarAccess.getAtomicExprAccess().getCondAssignment_3_2(), "rule__AtomicExpr__CondAssignment_3_2");
					put(grammarAccess.getAtomicExprAccess().getThenAssignment_3_4(), "rule__AtomicExpr__ThenAssignment_3_4");
					put(grammarAccess.getAtomicExprAccess().getElseAssignment_3_5_1(), "rule__AtomicExpr__ElseAssignment_3_5_1");
					put(grammarAccess.getAtomicExprAccess().getTypeAssignment_4_2(), "rule__AtomicExpr__TypeAssignment_4_2");
					put(grammarAccess.getAtomicExprAccess().getFieldExprsAssignment_4_4(), "rule__AtomicExpr__FieldExprsAssignment_4_4");
					put(grammarAccess.getAtomicExprAccess().getFieldExprsAssignment_4_5_1(), "rule__AtomicExpr__FieldExprsAssignment_4_5_1");
					put(grammarAccess.getAtomicExprAccess().getTypeAssignment_5_2(), "rule__AtomicExpr__TypeAssignment_5_2");
					put(grammarAccess.getAtomicExprAccess().getExprsAssignment_5_4(), "rule__AtomicExpr__ExprsAssignment_5_4");
					put(grammarAccess.getAtomicExprAccess().getExprsAssignment_5_5_1(), "rule__AtomicExpr__ExprsAssignment_5_5_1");
					put(grammarAccess.getAtomicExprAccess().getTypeAssignment_6_2(), "rule__AtomicExpr__TypeAssignment_6_2");
					put(grammarAccess.getAtomicExprAccess().getExprsAssignment_6_4(), "rule__AtomicExpr__ExprsAssignment_6_4");
					put(grammarAccess.getAtomicExprAccess().getExprsAssignment_6_5_1(), "rule__AtomicExpr__ExprsAssignment_6_5_1");
					put(grammarAccess.getAtomicExprAccess().getPatternAssignment_7_1(), "rule__AtomicExpr__PatternAssignment_7_1");
					put(grammarAccess.getAtomicExprAccess().getArgsAssignment_7_3_0(), "rule__AtomicExpr__ArgsAssignment_7_3_0");
					put(grammarAccess.getAtomicExprAccess().getArgsAssignment_7_3_1_1(), "rule__AtomicExpr__ArgsAssignment_7_3_1_1");
					put(grammarAccess.getAtomicExprAccess().getSpecAssignment_8_2(), "rule__AtomicExpr__SpecAssignment_8_2");
					put(grammarAccess.getAtomicExprAccess().getArgsAssignment_8_4_0(), "rule__AtomicExpr__ArgsAssignment_8_4_0");
					put(grammarAccess.getAtomicExprAccess().getArgsAssignment_8_4_1_1(), "rule__AtomicExpr__ArgsAssignment_8_4_1_1");
					put(grammarAccess.getLiteralExprAccess().getValueAssignment_0_1(), "rule__LiteralExpr__ValueAssignment_0_1");
					put(grammarAccess.getLiteralExprAccess().getUnitAssignment_0_2(), "rule__LiteralExpr__UnitAssignment_0_2");
					put(grammarAccess.getLiteralExprAccess().getValueAssignment_1_1(), "rule__LiteralExpr__ValueAssignment_1_1");
					put(grammarAccess.getLiteralExprAccess().getValueAssignment_2_1(), "rule__LiteralExpr__ValueAssignment_2_1");
					put(grammarAccess.getLiteralExprAccess().getUnitAssignment_2_2(), "rule__LiteralExpr__UnitAssignment_2_2");
					put(grammarAccess.getUnusedExprAccess().getIdsAssignment_2(), "rule__UnusedExpr__IdsAssignment_2");
					put(grammarAccess.getUnusedExprAccess().getIdsAssignment_3_1(), "rule__UnusedExpr__IdsAssignment_3_1");
					put(grammarAccess.getUnusedExprAccess().getSpecAssignment_7(), "rule__UnusedExpr__SpecAssignment_7");
					put(grammarAccess.getUnusedExprAccess().getArgsAssignment_9(), "rule__UnusedExpr__ArgsAssignment_9");
					put(grammarAccess.getUnusedExprAccess().getArgsAssignment_10_1(), "rule__UnusedExpr__ArgsAssignment_10_1");
					put(grammarAccess.getFieldExprAccess().getFieldAssignment_0(), "rule__FieldExpr__FieldAssignment_0");
					put(grammarAccess.getFieldExprAccess().getExprAssignment_2(), "rule__FieldExpr__ExprAssignment_2");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			com.rockwellcollins.ui.contentassist.antlr.internal.InternalSpearParser typedParser = (com.rockwellcollins.ui.contentassist.antlr.internal.InternalSpearParser) parser;
			typedParser.entryRuleFile();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public SpearGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(SpearGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
