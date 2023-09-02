package com.jdc.hello.beans;

public class EmployeeStaticFactory {
	
	public static Employee withNameEmail(String name, String email) {
		var emp = new Employee();
		emp.setName(name);
		emp.setEmail(email);
		return emp;
	}

	public static Employee withName(String name) {
		var emp = new Employee();
		emp.setName(name);
		return emp;
	}
	
	public static Employee withEmail(String email) {
		var emp = new Employee();
		emp.setEmail(email);
		return emp;
	}
	
}
