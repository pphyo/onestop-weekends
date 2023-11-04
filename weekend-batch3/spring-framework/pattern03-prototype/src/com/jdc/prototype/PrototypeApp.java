package com.jdc.prototype;

public class PrototypeApp {

	public static void main(String[] args) {
		
		var original = new AppService();
		original.setData("Hello");
		
		System.out.println(original);
		System.out.println(original.getData());
		
		var copy = original.clone();
		System.out.println(copy);
		System.out.println(copy.getData());
		
		var other = new AppService();
		System.out.println(other);
		System.out.println(other.getData());

	}

}
