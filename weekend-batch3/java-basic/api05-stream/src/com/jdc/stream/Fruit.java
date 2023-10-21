package com.jdc.stream;

public class Fruit {

	private String name;
	private String color;
	private double weight;
	
	public Fruit() {}
	
	public Fruit(String line) {
		String[] arr = line.split(",");
		name = arr[0].trim();
		color = arr[1].trim();
		weight = Double.parseDouble(arr[2].trim());
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public String getColor() {
		return color;
	}

	public double getWeight() {
		return weight;
	}
	
	public String toString() {
		return "%-15s | %-8s | %3.2fg".formatted(name, color, weight);
	}

}








