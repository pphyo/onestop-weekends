package com.jdc.test;

import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

public class ElementaryMappingTest {
	
	@Test
	void test() {
		var emf = Persistence.createEntityManagerFactory("emapping");
		
		emf.close();
	}

}
