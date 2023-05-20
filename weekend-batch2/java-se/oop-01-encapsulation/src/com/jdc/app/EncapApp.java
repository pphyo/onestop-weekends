package com.jdc.app;

// tony horey

public class EncapApp {

	public static void main(String[] args) {
		
		// I am (name). I am (age) (year) old. I work as (job).
		
		int i = 20;
		
		User user = new User();
		System.out.println(user.getAge());
		
		user.setAge(15);
		
		System.out.println(user.getAge());

		
//		int age = 10;
//		String year = age > 1 ? "years" : "year";
//		
//		String result = "I am %s.%nI am %d %s old.%nI work as %s.%nI got %f salary.";
//		
//		System.out.printf(result, "Mg Mg", age, year, "Programmer", 300_000.0);
		
	}
	
	static void showData(String data) {
		System.out.println(data);
	}

}
