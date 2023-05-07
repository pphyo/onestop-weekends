package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.LocalDate;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.LazyInitializationException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.em.Registration;
import com.jdc.em.Student;
import com.jdc.em.Student.Gender;

@TestMethodOrder(OrderAnnotation.class)
public class FetchModeTest {
	
	static EntityManagerFactory emf;
	
	@Disabled
	@Test
	@Order(1)
	void test_for_find() {
		
		var em = emf.createEntityManager();
		
		var stu = em.find(Student.class, 1);
		
		assertTrue(em.contains(stu));
		
		em.detach(stu);
		
		assertFalse(em.contains(stu));
		
		assertAll(
			() -> assertEquals("Hero Hamada", stu.getName()),
			() -> assertEquals(Gender.Male, stu.getGender())
		);
		
//		em.getTransaction().begin();
//		stu.setName("Andy");
//		em.getTransaction().commit();
		
	}
	
	@Disabled
	@Test
	@Order(2)
	void test_for_getReference() {
		
		var em = emf.createEntityManager();
		
		var stu = em.getReference(Student.class, 1);
		
		assertTrue(em.contains(stu));
		
		em.detach(stu);
		
		assertFalse(em.contains(stu));
		
		assertAll(
			() -> assertThrows(LazyInitializationException.class, () -> stu.getName()),
			() -> assertThrows(LazyInitializationException.class, () -> stu.getGender())
		);
		
	}
	
	@Test
	@Order(3)
	void test_for_default_fetch_mode() {
		
		var em = emf.createEntityManager();
		
		var entity = em.find(Student.class, 1);
		
		assertTrue(em.contains(entity));
		
//		System.out.println(entity.getRegistrations());
//		assertEquals("Hero Hamada", reg.getStudent().getName());
		
		em.close();
		
	}
	
	@Test
	@Order(4)
	void test_for_cascade() {
		var em = emf.createEntityManager();	
		em.getTransaction().begin();
		
		var stu = new Student();
		stu.setName("Moana");
		stu.setGender(Gender.Female);

		var reg1 =  new Registration();
		reg1.setRegDate(LocalDate.of(2023, 2, 17));
		reg1.setRegFees(70000);
		
		var reg2 = new Registration();
		reg2.setRegDate(LocalDate.of(2022, 9, 30));
		reg2.setRegFees(150000);
		
//		stu.getRegistrations().add(reg1);
//		reg1.setStudent(stu); // bi dir
		
		stu.addRegistration(reg1);
		stu.addRegistration(reg2);
		
		em.persist(stu);
		
		em.getTransaction().commit();
		
		em.getTransaction().begin();
		
		em.remove(em.find(Student.class, 4));
		
		em.getTransaction().commit();
		
		em.close();
	}

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		emf = Persistence.createEntityManagerFactory("em");
	}

	@AfterAll
	static void tearDownAfterClass() {
		if(null != emf && emf.isOpen())
			emf.close();
	}


}
