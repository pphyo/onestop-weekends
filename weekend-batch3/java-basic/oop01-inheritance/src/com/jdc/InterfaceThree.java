package com.jdc;

public interface InterfaceThree extends InterfaceOne, InterfaceTwo {
	
	void start();
	
	@Override
	default void doAction() {
		InterfaceOne.super.doAction();
	}
	
	default void otherAction() {
		this.doAction();
		this.start();
	}
	
}
