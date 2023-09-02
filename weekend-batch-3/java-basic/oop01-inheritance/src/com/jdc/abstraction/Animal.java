package com.jdc.abstraction;

public abstract class Animal {

	private String name;
	private String color;
	private int leg;

	public Animal(String name, String color, int leg) {
		super();
		this.name = name;
		this.color = color;
		this.leg = leg;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public int getLeg() {
		return leg;
	}

	public abstract void eat();

}









