package com.jdc.abstraction;

public class Bird extends Animal implements Flyable, Swimmable {

	public Bird(String name, String color, int leg) {
		super(name, color, leg);
	}

	@Override
	public void eat() {
		System.out.println("Bird eats");
	}

	@Override
	public void fly() {
		System.out.println("Bird flies");
	}

	@Override
	public void swim() {
		System.out.println("Bird swims");
	}

}
