package com.jdc.factory;

public class CustomerFactory {
	
	public Customer withAddress(String address) {
		var customer = new Customer();
		customer.setAddress(address);
		return customer;
	}
	
	// static factory
	public static Customer withName(String name) {
		var customer = new Customer();
		customer.setName(name);
		return customer;
	}
	
	public static Customer withPhone(String phone) {
		var customer = new Customer();
		customer.setPhone(phone);
		return customer;
	}

}
