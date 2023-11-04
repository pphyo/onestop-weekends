package com.jdc.di.beans;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dIService")
@Qualifier("optional")
public class DIService implements BaseService {
	
	public void doService(String data) {
		System.out.println("DI Service with " + data);
	}

}
