package com.jdc.app;

public class StringApp {

	public static void main(String[] args) {
		
		String value1 = "S" + "M" + "O" + "K" + "Y";
		String value2 = "SMO" + "KY";
		
		System.out.println(value1 == value2);
				
		System.out.println();
		
		String text1 = "Hello";
		String text2 = " JDC";
		String text3 = "Hello JDC";
		text1 = text1.concat(text2);
		
		System.out.println(text1);
		System.out.println(text1 == text3);
		
		System.out.println();
		String s1 = "Hello World";
		String s2 = " Hello World".trim();
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s1 == s2);
		
	}
	
	static void eqAndhashCode() {
		var user1 = new User("Luffy", 24, "09393933");
		var user2 = new User("Luffy", 24, "0939530203");
		
		System.out.println(user1);
		System.out.println(user2);
		System.out.println(user1 == user2);
		System.out.println(user1.equals(user2));
	}

}
