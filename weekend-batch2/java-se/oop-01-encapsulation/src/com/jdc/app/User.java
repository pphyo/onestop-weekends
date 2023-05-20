package com.jdc.app;

public class User {
	
	private String name;
	private int age; // age = -1;
	
	public User() {
//		System.out.println(age);
//		this.age = age; // variable hiding
		System.out.println("Constructor");
		
	}
	
	// getter or accessor
	public int getAge() {
		return age;
	}
	
	public String toString() {
		return "%s : %d".formatted(name, age);
	}
	
	// setter or mutator
	public void setAge(int age) {
		System.out.println("Setter");
		this.age = age;
	}

}