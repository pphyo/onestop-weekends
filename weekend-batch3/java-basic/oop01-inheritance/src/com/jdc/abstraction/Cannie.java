package com.jdc.abstraction;

public abstract class Cannie extends Animal {

	public Cannie(String name, String color, int leg) {
		super(name, color, leg);
	}
	
	@Override
	public void eat() {
		System.out.println("Cannie eats meats.");		
	}
}
