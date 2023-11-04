package com.jdc.singleton;

public class SingletonApp {

	public static void main(String[] args) {
		
		var serviceOne = AppService.getInstance();
		var serviceTwo = AppService.getInstance();
		
		System.out.println(serviceOne == serviceTwo);

	}

}
