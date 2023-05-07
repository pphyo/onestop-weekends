package com.jdc.builder;

public class BuilderApp {
	
	public static void main(String[] args) {
		
		var cb = new CarBuilder();
		
		var car = cb.create()
					.setDoor(4)
					.setModel("Fit")
					.setHp(100)
					.build();
		
		System.out.println(car.getDoor());
		System.out.println(car.getModel());
		System.out.println(car.getHp());
		System.out.println(car.isAuto());
		
	}

}
