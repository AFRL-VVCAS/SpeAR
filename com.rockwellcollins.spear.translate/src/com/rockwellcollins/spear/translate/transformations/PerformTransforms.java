package com.rockwellcollins.spear.translate.transformations;

import com.rockwellcollins.spear.translate.intermediate.PatternDocument;
import com.rockwellcollins.spear.translate.intermediate.SpearDocument;
import com.rockwellcollins.spear.translate.intermediate.TypeDocument;

public class PerformTransforms {

	public static void apply(SpearDocument doc) throws Exception {
		ReplaceAbstractTypes.transform(doc);
		ReplaceVariableArrayDefs.transform(doc);
		//must come after replace Variable array defs
		PropagatePredicates.transform(doc); 
		RemoveCompositeReferences.transform(doc);
		ReplaceShortHandRecords.transform(doc);
		NormalizeOperators.transform(doc);
		RemoveSugar.transform(doc);
		ReplaceSpecificationCalls.transform(doc);
		UniquifyNormalizedCalls.transform(doc);
		//this must be last (because transformations can undo some of it
		CreateUserNamespace.transform(doc);
	}
	
	public static void apply(PatternDocument doc) throws Exception {
		ReplaceAbstractTypes.transform(doc);
		ReplaceVariableArrayDefs.transform(doc);
		PropagatePredicates.transform(doc);
		ReplaceShortHandRecords.transform(doc);
		NormalizeOperators.transform(doc);
		RemoveSugar.transform(doc);
		//this must be last (because transformations can undo some of it
		CreateUserNamespace.transform(doc);
	}
	
	public static void apply(TypeDocument doc) throws Exception {
		ReplaceAbstractTypes.transform(doc);
		ReplaceVariableArrayDefs.transform(doc);
		NormalizeOperators.transform(doc);
		RemoveSugar.transform(doc);
		//this must be last (because transformations can undo some of it
		CreateUserNamespace.transform(doc);
	}
}
