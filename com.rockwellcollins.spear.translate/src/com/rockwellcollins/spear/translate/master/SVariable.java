package com.rockwellcollins.spear.translate.master;

import java.util.ArrayList;
import java.util.List;

import com.rockwellcollins.spear.Type;
import com.rockwellcollins.spear.Variable;
import com.rockwellcollins.spear.translate.lustre.TranslateType;
import com.rockwellcollins.spear.translate.naming.NameMap;

import jkind.lustre.Equation;
import jkind.lustre.VarDecl;

public class SVariable {

	public static List<SVariable> build(List<Variable> list, NameMap map) {
		List<SVariable> processed = new ArrayList<>();
		for(Variable v : list) {
			processed.add(SVariable.build(v, map));
		}
		return processed;
	}
	
	public static List<VarDecl> toVarDecl(List<SVariable> list, NameMap map) {
		List<VarDecl> lustre = new ArrayList<>();
		for(SVariable svar : list) {
			lustre.add(svar.toLustre(map));
		}
		return lustre;
	}
	
	public static List<VarDecl> toShadowVarDecl(List<SVariable> list, NameMap map) {
		List<VarDecl> lustre = new ArrayList<>();
		for(SVariable svar : list) {
			lustre.add(svar.toShadowLustre(map));
		}
		return lustre;
	}
	
	public static List<Equation> toShadowAssignmentEquations(List<SVariable> variables, NameMap map) {
		List<jkind.lustre.Equation> equations = new ArrayList<>();
		for(SVariable v : variables) {
			equations.add(v.toShadowAssignmentEquation(map));
		}
		return equations;
	}

	
	public static SVariable build(Variable v, NameMap map) {
		return new SVariable(v,map);
	}
	
	public String name;
	public String shadowName;
	public Type type;
	
	public SVariable(Variable v, NameMap map) {
		this.name=map.getName(v);
		this.shadowName=map.getShadowName(v);
		this.type=v.getType();
	}
	
	public jkind.lustre.VarDecl toLustre(NameMap nameMap) {
		jkind.lustre.Type type = TranslateType.translate(this.type, nameMap);
		return new jkind.lustre.VarDecl(this.name,type);
	}
	
	public jkind.lustre.VarDecl toShadowLustre(NameMap nameMap) {
		jkind.lustre.Type type = TranslateType.translate(this.type, nameMap);
		return new jkind.lustre.VarDecl(this.shadowName,type);
	}

	public jkind.lustre.Equation toShadowAssignmentEquation(NameMap map) {
		jkind.lustre.IdExpr lhs = new jkind.lustre.IdExpr(this.name);
		jkind.lustre.IdExpr rhs = new jkind.lustre.IdExpr(this.shadowName);
		return new jkind.lustre.Equation(lhs,rhs);
	}
}
