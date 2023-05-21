package com.jdc.app.cont;

public class Cat extends Animal {

	private String name;
	private int age;

	public Cat(String color) {
		super(color);
		System.out.println("1 arg constructor.");
	}

	public Cat(String color, String species) {
		this(color);
		super.setSpecies(species);
		System.out.println("2 args constructor.");
	}

	public Cat(String color, String species, String name) {
		this(color, species);
		this.name = name;
		System.out.println("3 args constructor.");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void meow() {
	}

}
