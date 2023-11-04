package com.jdc.beans;

public class MyServiceInstanceFactory {
	
	public MyService withoutConstructorArg() {
		return new MyService();
	}
	
	public MyService withConstructorArg(String message) {
		return new MyService();
	}

}
