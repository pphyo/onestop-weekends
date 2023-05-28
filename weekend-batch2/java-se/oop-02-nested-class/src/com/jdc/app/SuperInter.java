package com.jdc.app;

public interface SuperInter {
	
	void run();
	
	static void command(String message) {
		System.out.println(message);
	}

}
