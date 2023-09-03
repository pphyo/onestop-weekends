package com.jdc;

public interface InterfaceOne {
	
	void show();
	
	default void doAction() {
		System.out.println("Interface One's instance doAction()");
	}
	
	static void greet() {
		System.out.println("Interface One's static greet()");
	}
}
