package com.jdc.jpa;

import javax.persistence.Persistence;

public class HelloJpaApp {

	public static void main(String[] args) {
		
		var emf = Persistence.createEntityManagerFactory("hello-jpa");
		
		emf.close();

	}

}
