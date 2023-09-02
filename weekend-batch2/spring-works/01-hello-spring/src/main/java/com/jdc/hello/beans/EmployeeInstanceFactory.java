package com.jdc.hello.beans;

public class EmployeeInstanceFactory {

	public Employee withNameEmail(String name, String email) {
		var emp = new Employee();
		emp.setName(name);
		emp.setEmail(email);
		return emp;
	}

	public Employee withName(String name) {
		var emp = new Employee();
		emp.setName(name);
		return emp;
	}
	
	public Employee withEmail(String email) {
		var emp = new Employee();
		emp.setEmail(email);
		return emp;
	}
	
}
