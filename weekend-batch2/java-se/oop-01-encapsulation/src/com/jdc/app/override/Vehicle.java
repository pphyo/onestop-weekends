package com.jdc.app.override;

public class Vehicle {
	
	private String model;
	private double hp;
	public int instData = 10;
	
	public String getModel() {
		return model;
	}
	
	public void setModel(String model) {
		this.model = model;
	}
	
	public double getHp() {
		return hp;
	}
	
	public void setHp(double hp) {
		this.hp = hp;
	}
	
	public static void info() {
		System.out.println("info() in Vehicle.");
	}
	
	public int getInstData() {
		return instData;
	}
	
	public Vehicle getVehicle() {
		return new Vehicle();
	}
	
	public void onStart() {
		System.out.println("onStart() in Vehicle.");
	}
	
	protected void onStop() {
		System.out.println("onStop() in Vehicle.");
	}

}
