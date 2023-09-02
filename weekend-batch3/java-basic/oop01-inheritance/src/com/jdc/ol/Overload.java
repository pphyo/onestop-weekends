package com.jdc.ol;

public class Overload {
	
	public void get() {
		System.out.println("No parameter");
	}
	
	public void get(int i) {
		System.out.println("One Parameter(Integer)");
	}
	
	public void get(String i) {
		System.out.println("One Parameter(String)");
	}
	
	public void get(byte b) {
		System.out.println("One Parameter(byte)");
	}
	
	public void get(long l) {
		System.out.println("One Parameter(long)");
	}

}
