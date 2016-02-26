package com.rockwellcollins.spear.translate.transformations;

public class PerformTransforms {

	public static void apply(SpearDocument p) throws Exception {
		RemoveLustreKeywords.transform(p);
		NormalizeOperators.transform(p);
		RemoveSugar.transform(p);
		ReplaceSpecificationCalls.replace(p);
	}
}
