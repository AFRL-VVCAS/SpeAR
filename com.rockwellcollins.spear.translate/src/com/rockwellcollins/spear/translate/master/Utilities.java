package com.rockwellcollins.spear.translate.master;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.EcoreUtil2;
import org.eclipse.xtext.util.SimpleAttributeResolver;

import com.rockwellcollins.spear.File;
import com.rockwellcollins.spear.Pattern;

import jkind.lustre.VarDecl;

public class Utilities {

	public static File getRoot(EObject o) {
		EObject root = EcoreUtil2.getRootContainer(o);
		if (root instanceof File) {
			File file = (File) root;
			return file;
		} else {
			throw new RuntimeException("Root of object: " + o + " should be a File construct.");
		}
	}
	
	public static EObject getTopContainer(EObject o) {
		EObject container = o.eContainer();
		if(container instanceof File || container instanceof Pattern) {
			return container;
		}
		return getTopContainer(container);
	}
	
	public static String getName(EObject o) {
		String name = SimpleAttributeResolver.NAME_RESOLVER.apply(o);
		if(name == null) {
			throw new RuntimeException("Name not found for object " + o);
		} else {
			return name;
		}
	}

	public static List<String> pullIdsOffVarDecls(List<VarDecl> decls) {
		List<String> strings = new ArrayList<>();
		for(VarDecl vd : decls) {
			strings.add(vd.id);
		}
		return strings;
	}
}
