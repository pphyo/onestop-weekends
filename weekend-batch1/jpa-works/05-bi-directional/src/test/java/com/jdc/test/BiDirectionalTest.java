package com.jdc.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jdc.bi.Category;
import com.jdc.bi.Item;

public class BiDirectionalTest {
	
	static EntityManagerFactory emf;
	EntityManager em;
	
	@Test
	void test() {
		
		em.getTransaction().begin();
		
		Category c1 = new Category();
		c1.setName("Food");
		
		Category c2 = new Category();
		c2.setName("Drink");
		
		Item itm1 = new Item();
		itm1.setName("Cheese");
		itm1.setPrice(5000);
		// Many To One
		itm1.setCategory(c1);
		
		Item itm2 = new Item();
		itm2.setName("Seaweed");
		itm2.setPrice(3500);
		// Many To One
		itm2.setCategory(c1);
		
		Item itm3 = new Item();
		itm3.setName("Burn");
		itm3.setPrice(1000);
		itm3.setCategory(c2);
		
		Item itm4 = new Item();
		itm4.setName("Boss Yogurt");
		itm4.setPrice(1300);
		itm4.setCategory(c2);
		
		// One to Many
//		c1.setItems(List.of(itm1, itm2));
//		c2.setItems(List.of(itm3, itm4));
			
		em.persist(c1);
		em.persist(c2);

//		em.persist(itm1);
//		em.persist(itm2);
//		em.persist(itm3);
//		em.persist(itm4);
		
		em.getTransaction().commit();
		
	}
	
	@BeforeAll
	static void init() throws Exception {
		emf = Persistence.createEntityManagerFactory("bi-dir");
	}
	
	@AfterAll
	static void shutdown() throws Exception {
		if(null != emf && emf.isOpen())
			emf.close();
	}
	
	@BeforeEach
	void open() {
		em = emf.createEntityManager();
	}
	
	@AfterEach
	void close() {
		if(null != em && em.isOpen())
			em.close();
	}
	
}
