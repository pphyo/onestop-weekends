package com.jdc.singleton;

public class Service {

	private static Service INSTANCE;
	
	private Service() {}
	
	public static Service getInstance() {
		if(null == INSTANCE)
			INSTANCE = new Service();
		return INSTANCE;
	}
	
}
