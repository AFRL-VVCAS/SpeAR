package com.rockwellcollins.spear.translate.layout;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.rockwellcollins.spear.Constraint;
import com.rockwellcollins.spear.Macro;
import com.rockwellcollins.spear.Specification;
import com.rockwellcollins.spear.Variable;

import jkind.results.layout.Layout;

public class SpearLayout implements Layout {

	private final Map<String,String> map;
	private final List<String> categories;
	
	public SpearLayout(Specification s) {
		
		if(s == null) {
			throw new IllegalArgumentException("Unable to create layout for null specification.");
		}
		
		categories = new ArrayList<>();
		
		String inputs = "Inputs";
		categories.add(inputs);
		
		String outputs = "Outputs";
		categories.add(outputs);
		
		String state = "State";
		categories.add(state);
		
		String macros = "Macros";
		categories.add(macros);
		
		String properties = s.getPropertiesKeyword();
		categories.add(properties);
				
		this.map=new HashMap<>();
		
		for(Variable v : s.getInputs()) {
			map.put(v.getName(), inputs);
		}
		
		for(Variable v : s.getOutputs()) {
			map.put(v.getName(), outputs);
		}
		
		for(Variable v : s.getState()) {
			map.put(v.getName(), state);
		}
		
		for(Macro m : s.getMacros()) {
			map.put(m.getName(), macros);
		}
		
		for(Constraint c : s.getBehaviors()) {
			map.put(c.getName(), properties);
		}
	}
	
	@Override
	public List<String> getCategories() {
		return categories;
	}

	@Override
	public String getCategory(String signal) {
		String prefix = signal.split("\\.|\\[")[0];
		return map.get(prefix);
	}
}
