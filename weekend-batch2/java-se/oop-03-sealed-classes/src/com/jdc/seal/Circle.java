package com.jdc.seal;

public final class Circle extends Shape {

	public Circle(int radius) {
		super(radius, 0);
	}

	@Override
	public double area() {
		return Math.PI * super.getWidth() * super.getWidth();
	}
	
}
