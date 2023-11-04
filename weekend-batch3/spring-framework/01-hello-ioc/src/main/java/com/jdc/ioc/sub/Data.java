package com.jdc.ioc.sub;

import org.springframework.stereotype.Component;

@Component("myData")
public class Data {
	
	public Data() {
		System.out.println("Data Default Constructor.");
	}

}
