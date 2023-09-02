package com.jdc.app.aspects;

public class LoggingAspect {
	
	public void doBefore() {
		System.out.println("Doing before bussiness.");
	}
	
	public void doAfter() {
		System.out.println("Doing after bussiness.");
	}

}
