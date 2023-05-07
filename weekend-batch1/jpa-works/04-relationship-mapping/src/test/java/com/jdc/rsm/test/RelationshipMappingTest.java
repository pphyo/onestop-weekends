package com.jdc.rsm.test;

import javax.persistence.Persistence;

import org.junit.jupiter.api.Test;

public class RelationshipMappingTest {
	
	@Test
	void test() {
		var emf = Persistence.createEntityManagerFactory("rsm");
//		var em = emf.createEntityManager();
//		
//		em.getTransaction().begin();
//		
//		Address add = new Address();
//		add.setEmail("mgmg@gmail.com");
//		add.setAddress("Yangon");
//		
//		em.persist(add);
//		
//		assertEquals(1, em.find(Address.class, 1).getId());
//		
//		Customer c = new Customer();
////		c.setAddress(add);
//		c.setName("Mg Mg");
//		c.setPhone("0939393939");
//		
//		em.persist(c);
//
//		em.getTransaction().commit();
//		
//		em.close();
		emf.close();
	}

}
