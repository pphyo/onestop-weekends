package com.jdc.builder;

public class CarBuilder {
	
	private Car car;
	
	public CarBuilder create() {
		car = new Car();
		return this;
	}
	
	public CarBuilder setModel(String model) {
		car.setModel(model);
		return this;
	}

	public CarBuilder setYear(String year) {
		car.setYear(year);
		return this;
	}
	
	public CarBuilder setDoor(int door) {
		car.setDoor(door);
		return this;
	}
	
	public CarBuilder setWheel(int wheel) {
		car.setWheel(wheel);
		return this;
	}
	
	public CarBuilder setHp(double hp) {
		car.setHp(hp);
		return this;
	}
	
	public CarBuilder setAuto(boolean auto) {
		car.setAuto(auto);
		return this;
	}
	
	public Car build() {
		return car;
	}

}
