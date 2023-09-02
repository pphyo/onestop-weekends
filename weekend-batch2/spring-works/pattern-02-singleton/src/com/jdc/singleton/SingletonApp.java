package com.jdc.singleton;

public class SingletonApp {

	public static void main(String[] args) {
		Client c1 = new Client("Wendy", 200, "3030303");
		Client c2 = new Client("Wendy", 600, "330303");
		Client c3 = new Client("Mr. Smee", 300, "400000");
		
		System.out.println(c1 == c2);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c1 == c2);
		
		Service ser1 = Service.getInstance();
		Service ser2 = Service.getInstance();
		
		System.out.println(ser1);
		System.out.println(ser2);
		System.out.println(ser1 == ser2);
	}

}
