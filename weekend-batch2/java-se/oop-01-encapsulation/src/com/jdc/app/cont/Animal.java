package com.jdc.app.cont;

public class Animal {
	
//	static {
//		System.out.println("Static Block in Animal");
//	}
//	
//	{
//		System.out.println("Instance Block in Animal");
//	}
	
	public Animal() {
		System.out.println("Default Animal Constructor");
	}
	
	public Animal(String color) {
		this.color = color;
		System.out.println("Animal Constructor");
	}

	private String color;
	private String species;
	public int instData = 10;
	public static int statData = 20;

	public String getColor() {
		return color;
	}
	
	// overloading
	public String getColor(int i) {
		return "";
	}
	
	public String getColor(String i) {
		return "";
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSpecies() {
		return species;
	}

	public void setSpecies(String species) {
		this.species = species;
	}
	
	public static void info() {
		System.out.println("Static mehtod in animal");
	}

}
