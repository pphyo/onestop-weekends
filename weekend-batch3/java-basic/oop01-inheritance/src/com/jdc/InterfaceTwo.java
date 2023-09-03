package com.jdc;

public interface InterfaceTwo {
	
	void show();
	
	default void doAction() {
		System.out.println("Interface One's instance doAction()");
	}
	
	static void greet() {
		System.out.println("Interface Two's static greet()");
	}
}
