package com.jdc.inherit;

public class Person {

	private String name;
	private int age;
	private double salary;
	private String email;

	public Person() {
		super();
		System.out.println("Default Constructor");
	}
	
	// Constructor Overloading or Chaining
	public Person(String name) {
		super();
		this.name = name;
		System.out.println("1 arg Constructor");
	}
	
	public Person(String name, int age) {
		this(name);
		this.age = age;
		System.out.println("2 args Constructor");
	}
	
	public Person(String name, int age, double salary) {
		this(name, age);
		this.salary = salary;
		System.out.println("3 args Constructor");
	}
	
	public Person(String name, int age, double salary, String email) {
		this(name, age, salary);
		this.email = email;
		System.out.println("4 args Constructor");
	}
	
	void eat() {}

	void greet() {
		System.out.println();
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public double getSalary() {
		return salary;
	}

	public String getEmail() {
		return email;
	}

}
