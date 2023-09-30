package com.jdc.coll.domain;

public class Item implements Comparable<Item> {

	private int id;
	private String name;
	private double price;
	private int stock;
	
	@Override
	public int compareTo(Item o) {
		return o.getName().compareTo(name);
	}
	
	@Override
	public String toString() {
		return "%d, %s, %.2f, %d%n".formatted(id, name, price, stock);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

}
