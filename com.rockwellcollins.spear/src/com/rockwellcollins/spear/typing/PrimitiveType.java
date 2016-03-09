package com.rockwellcollins.spear.typing;

public class PrimitiveType extends Type {
	
	public static final PrimitiveType BOOL = new PrimitiveType("bool");
	public static final PrimitiveType REAL = new PrimitiveType("real");
	public static final PrimitiveType INT = new PrimitiveType("int");
	public static final PrimitiveType ERROR = new PrimitiveType("<ERROR>");
	
	private final String name;
	
	private PrimitiveType(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
