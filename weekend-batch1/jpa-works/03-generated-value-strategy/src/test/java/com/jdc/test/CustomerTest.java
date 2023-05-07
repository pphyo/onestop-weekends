package com.jdc.test;

import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

public class CustomerTest {
	
	@Test
	void test() {
		var emf = Persistence.createEntityManagerFactory("gvs");
		
		emf.close();
	}

}
