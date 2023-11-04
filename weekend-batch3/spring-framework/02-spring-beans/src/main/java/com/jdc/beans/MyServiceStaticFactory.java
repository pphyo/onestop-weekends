package com.jdc.beans;

public class MyServiceStaticFactory {

	public static MyService create(String message) {
		return new MyService();
	}
	
}
