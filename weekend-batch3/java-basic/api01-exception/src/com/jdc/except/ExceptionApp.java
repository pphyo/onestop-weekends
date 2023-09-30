package com.jdc.except;

public class ExceptionApp {
	
	public static void main(String[] args) {
		
		var app = new ExceptionApp();
		
		System.out.println(app.isEmpty(""));
		
		System.out.println("Program start.");
		
		app.doException("Isabela Yolander Merced", 20, "0819393939");
		
		System.out.println("Program end.");
		
	}
	
	public void run() {
		
		
		
	}
	
	public Student doException(String name, int age, String phone) {
		
		if(isEmpty(name)) {
			throw new StudentException("Name cannot Empty!");
		}
		
		if(age <= 0) {
			throw new StudentException("Age must be greater than zero!");
		}
		
		if(isEmpty(phone)) {
			throw new StudentException("Phone cannot Empty!");
		}
		
		var student = new Student();
		student.setName(name);
		student.setAge(age);
		student.setPhone(phone);
		
		return student;
	}
	
	private boolean isEmpty(String data) {
		if(null == data || data.isEmpty() || data.isBlank()) {
			return true;
		}
		return false;
	}

}






