package com.jdc.di.beans;

import org.springframework.stereotype.Component;

@Component
@ServiceQualifier
public class DIDefaultService implements BaseService {

	@Override
	public void doService(String data) {
		System.out.println("DI Default Service with " + data);		
	}
	
}
