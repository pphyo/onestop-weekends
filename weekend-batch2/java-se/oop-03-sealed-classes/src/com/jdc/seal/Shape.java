package com.jdc.seal;

import com.jdc.seal.other.Triangle;

abstract public sealed class Shape permits Circle, Rectangle, Triangle{

	public int width;
	private int height;
	
	public Shape(int width, int height) {
		this.width = width;
		this.height = height;
	}

	public int getWidth() {
		return width;
	}

	public int getHeight() {
		return height;
	}
	
	public abstract double area();
	
}
