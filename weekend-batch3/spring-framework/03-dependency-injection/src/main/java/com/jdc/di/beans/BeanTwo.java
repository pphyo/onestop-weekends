package com.jdc.di.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BeanTwo {
	
	@Autowired
	private BeanOne one;
	
	public void doTwo() {
		one.doOne();
		System.out.println("Two is doing.");
	}

}
