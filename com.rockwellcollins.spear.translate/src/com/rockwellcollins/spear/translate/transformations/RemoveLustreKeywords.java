package com.rockwellcollins.spear.translate.transformations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import com.rockwellcollins.spear.translate.intermediate.Document;

public class RemoveLustreKeywords {

	public static Set<String> getLustreKeywordSet() {
		Set<String> keywords = new TreeSet<>();
		keywords.add("then");
		keywords.add("type");
		keywords.add("pre");
		keywords.add("struct");
		keywords.add("true");
		keywords.add("else");
		keywords.add("tel");
		keywords.add("condact");
		keywords.add("let");
		keywords.add("and");
		keywords.add("var");
		keywords.add("floor");
		keywords.add("int");
		keywords.add("if");
		keywords.add("not");
		keywords.add("of");
		keywords.add("subrange");
		keywords.add("real");
		keywords.add("enum");
		keywords.add("assert");
		keywords.add("returns");
		keywords.add("mod");
		keywords.add("const");
		keywords.add("div");
		keywords.add("bool");
		keywords.add("xor");
		keywords.add("false");
		keywords.add("node");
		keywords.add("or");
		
		//these aren't Lustre keywords, but ones we're reserving for the translation
		keywords.add("initially");
		keywords.add("once");
		keywords.add("historically");
		keywords.add("since");
		keywords.add("triggers");
		keywords.add("responds_within");
		keywords.add("fmod");
		keywords.add("counter");
		return keywords;
	}
	
	public static void transform(Document doc) {
		doc.files.forEach(f -> doc.renamed.put(f, transform(f)));
	}
	
	public static Map<String,String> transform(EObject o) {
		RemoveLustreKeywords rlk = new RemoveLustreKeywords();
		return rlk.processNames(o);
	}

	private final Set<String> keywords;
	
	public RemoveLustreKeywords() {
		keywords = RemoveLustreKeywords.getLustreKeywordSet();
	}
	
	private boolean checkForConflict(String name) {
		for(String keyword : keywords) {
			if(name.equals(keyword)) {
				return true;
			}
		}
		return false;
	}
	
	private String makeNameUnique(String original) {
		return original + "_";
	}
	
	private Map<String,String> processNames(EObject root) {
		Map<String,String> renamed = new HashMap<>();
		SimpleAttributeResolver<EObject, String> resolver = SimpleAttributeResolver.newResolver(String.class,"name");
		for (EObject e : EcoreUtil2.getAllContentsOfType(root, EObject.class)) {
			String name = resolver.apply(e);
			if (name != null) {
				if (checkForConflict(name)) {
					String uniqueName = makeNameUnique(name);
					e.eSet(resolver.getAttribute(e), uniqueName);
					renamed.put(uniqueName,name);
				}
			}
		}
		return renamed;
	}
}
