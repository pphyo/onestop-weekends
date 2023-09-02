package com.jdc.hello.beans;

import org.springframework.stereotype.Component;

@Component(value = "emp1")
public class Employee {

	private String name;
	private String email;
	
	Employee() {}
	
	public Employee(String name, String email) {
		super();
		this.name = name;
		this.email = email;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

}
