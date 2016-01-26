package com.rockwellcollins.spear.translate.lustre;

import org.eclipse.emf.ecore.EObject;

import com.rockwellcollins.spear.BoolType;
import com.rockwellcollins.spear.IntType;
import com.rockwellcollins.spear.RealType;
import com.rockwellcollins.spear.UserType;
import com.rockwellcollins.spear.util.SpearSwitch;

import jkind.lustre.Type;

public class TranslateType extends SpearSwitch<Type> {

	public static Type translate(com.rockwellcollins.spear.Type type) {
		return new TranslateType().doSwitch(type); 
	}
	
	@Override
	public Type caseUserType(UserType ut) {
		return new jkind.lustre.NamedType(ut.getDef().getName());
	}
		
	@Override
	public Type caseBoolType(BoolType bt) {
		return jkind.lustre.NamedType.BOOL;
	}
	
	@Override
	public Type caseIntType(IntType it) {
		return jkind.lustre.NamedType.INT;
	}
	
	@Override
	public Type caseRealType(RealType rt) {
		return jkind.lustre.NamedType.REAL;
	}
	
	@Override
	public Type caseType(com.rockwellcollins.spear.Type type) {
		throw new RuntimeException("Type cannot be translated to Lustre.");
	}
	
	@Override
	public Type defaultCase(EObject o) {
		throw new RuntimeException("Expected a type, but received " + o);
	}
}