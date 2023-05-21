package com.jdc.app.override;

public class MotorCycle extends Vehicle {

	// Override
	@Override
	public void onStart() {
		System.out.println("onStart() in MotorCycle.");
	}
	
}
