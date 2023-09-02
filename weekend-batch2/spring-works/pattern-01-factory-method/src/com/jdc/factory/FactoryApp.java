package com.jdc.factory;

import com.jdc.factory.obj.UserFactory;

public class FactoryApp {

	public static void main(String[] args) {
		
		var user = UserFactory.withName("JDC");
		
		System.out.println(user.getUsername());

	}

}
