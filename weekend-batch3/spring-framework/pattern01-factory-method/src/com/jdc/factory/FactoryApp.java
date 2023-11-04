package com.jdc.factory;

public class FactoryApp {

	public static void main(String[] args) {
		
		Customer customer = CustomerFactory.withName("Merced");
		System.out.println(customer.getName());
		
		customer = new CustomerFactory().withAddress("Yangon");
		System.out.println(customer.getAddress());

	}

}
