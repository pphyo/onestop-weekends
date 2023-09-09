package com.jdc.except;

public class SubChild extends SuperParent {
	
	@Override
	public void change() throws ArrayIndexOutOfBoundsException {
		System.out.println("sub child");
	}

}
