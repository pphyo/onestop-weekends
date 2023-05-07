package com.jdc.test;

import java.awt.Color;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.jdc.inherit.Student;

public class InheritanceMappingTest {

	static EntityManagerFactory emf;
	EntityManager em;
	
	@Test
	void test() {
		
		em.getTransaction().begin();
		
		var stu = new Student();
		stu.setId(1);
		stu.setName("Hla Hla");
		stu.setLoginId("hlahla");
		stu.setPassword("Hla@123");
		stu.setColor(new Color(0f, 0f, 0f, 0.2f));
		
		em.persist(stu);
		
		em.getTransaction().commit();
		
	}
	
	@BeforeAll
	static void setUpBeforeClass() {
		emf = Persistence.createEntityManagerFactory("inherit");
	}
	
	@AfterAll
	static void tearDownAfterClass() {
		if(null != emf && emf.isOpen())
			emf.close();
	}
	
	@BeforeEach
	void setUp() {
		em = emf.createEntityManager();
	}
	
	@AfterEach
	void tearDown() {
		if(null != em && em.isOpen())
			em.close();
	}

}
