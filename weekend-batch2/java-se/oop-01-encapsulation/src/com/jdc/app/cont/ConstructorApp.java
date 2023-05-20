package com.jdc.app.cont;

public class ConstructorApp {

	public static void main(String[] args) {
		
		Tiger t1 = new Tiger();
		Tiger t2 = new Tiger();
		
		System.out.println(t1.getColor());
		System.out.println(t2.getColor());
		
		Lion l1 = new Lion("Gold");
		Lion l2 = new Lion("Pink");
		
		System.out.println(l1.getColor());
		System.out.println(l2.getColor());

	}

}
