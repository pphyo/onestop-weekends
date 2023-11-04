package com.jdc.singleton;

public class AppService {
	
	private static AppService INSTANCE;
	
	private AppService() {
		
	}
	
	public static AppService getInstance() {
		if(null == INSTANCE)
			INSTANCE = new AppService();
		
		return INSTANCE;
	}

}
