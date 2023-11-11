package com.jdc.di.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanThree {
	
	@Autowired
	private BeanTwo two;
	
	public void doThree() {
		two.doTwo();
		System.out.println("Three is doing.");
	}

}
