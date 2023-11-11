package com.jdc.di.beans;

import org.springframework.stereotype.Component;

@Component
@ServiceQualifier(ServiceType.CUSTOM)
public class DIService implements BaseService {
	
	public void doService(String data) {
		System.out.println("DI Service with " + data);
	}

}
