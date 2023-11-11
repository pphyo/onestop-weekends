package com.jdc.di.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanOne {
	
	@Autowired
	private BeanThree three;
	
	public void doOne() {
		three.doThree();
		System.out.println("One is doing.");
	}

}
