package com.jdc.app.cont;

// super, parent, base
// sub, child, derived

public class Tiger extends Animal {
	
	public Tiger() {
		super("Yellow"); // Animal Default Construtor
		System.out.println("Tiger Constructor");
	}
	
//	static {
//		System.out.println("Static Block in Tiger");
//	}
//	
//	{
//		System.out.println("Instance Block in Tiger");
//	}
	
}
