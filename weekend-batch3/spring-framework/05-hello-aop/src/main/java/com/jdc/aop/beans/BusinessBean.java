package com.jdc.aop.beans;

import org.springframework.stereotype.Component;

@Component
public class BusinessBean {
	
	public void doBusinessForBefore(String value, int count) {
		System.out.println("doBusinessForBefore() in BusinessBean with " + value);
	}
	
	public void doBusinessForAfter() {
		System.out.println("doBusinessForAfter() in BusinessBean");
	}
	
	public MasterData doBusinessForAfterReturning(String data) {
		System.out.println("doBusinessForAfterReturning() in BusinessBean");
		return new MasterData(data);
	}
	
	public void doBusinessForAfterThrowing() {
		System.out.println("doBusinessForAfterThrowing() in BusinessBean");
		throw new IllegalArgumentException("Throws from Business Bean");
	}
	
	public void doBusinessForAround() {
		System.out.println("doBusinessForAround() in BusinessBean");
	}

}
