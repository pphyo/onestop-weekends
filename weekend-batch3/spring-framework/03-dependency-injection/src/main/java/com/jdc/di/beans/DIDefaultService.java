package com.jdc.di.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("defaultService")
@Qualifier("default")
public class DIDefaultService implements BaseService {

	@Override
	public void doService(String data) {
		System.out.println("DI Default Service with " + data);		
	}
	
}
