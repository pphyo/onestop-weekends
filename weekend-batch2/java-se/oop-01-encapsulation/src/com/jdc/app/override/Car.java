package com.jdc.app.override;

public class Car extends Vehicle {
	
	public int instData = 20;
	
	public static void info() {
		System.out.println("info() in Car.");
	}
	
	@Override
	public int getInstData() {
		return super.getInstData();
	}
	
	// Covanient return type
	@Override
	public MotorCycle getVehicle() {
		return null;
	}
	
	@Override
	public void onStop() {
		System.out.println("onStop() in Car.");
	}
	
	public void playMusicWithDvdPlayer() {
		System.out.println("Playing Music...");
	}
	
	

}
