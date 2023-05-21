package com.jdc.app.override;

public class FinalApp {
	
	// current line, instance block, constructor
	final int DATA;
	
	// current line, static block
	static final int VALUE;
	
	static {
		VALUE = 300;
	}
	
	public FinalApp() {
		DATA = 20;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
