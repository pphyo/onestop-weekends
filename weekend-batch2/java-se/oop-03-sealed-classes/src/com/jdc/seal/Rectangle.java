package com.jdc.seal;

public final class Rectangle extends Shape {

	public Rectangle(int width, int height) {
		super(width, height);
	}
	
	@Override
	public double area() {
		return getWidth() * getHeight();
	}

}
