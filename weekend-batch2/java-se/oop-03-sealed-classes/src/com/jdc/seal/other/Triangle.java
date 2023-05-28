package com.jdc.seal.other;

import com.jdc.seal.Shape;

public final class Triangle extends Shape {

	public Triangle(int base, int height) {
		super(base, height);
	}

	@Override
	public double area() {
		return (getWidth() * getHeight()) / 2;
	}
	


}
