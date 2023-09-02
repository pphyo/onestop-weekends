package com.jdc.abstraction;

public class Horse extends Animal {
	
	public Horse(String name, String color, int leg) {
		super(name, color, leg);
	}

	public void eat() {
		System.out.println("Horse eats grass.");
	}
	
}
