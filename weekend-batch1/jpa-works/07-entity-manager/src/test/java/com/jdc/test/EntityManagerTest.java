package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import com.jdc.em.Student;
import com.jdc.em.Student.Gender;

@TestMethodOrder(OrderAnnotation.class)
public class EntityManagerTest {
	
	static EntityManagerFactory emf;
	
	@Test
	@Order(1)
	@DisplayName("insert data to student table")
	void test1() {
		
		var em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Student stu = new Student(); // transient state
		stu.setName("Ponyo");
		stu.setGender(Gender.Female);
		
		em.persist(stu);
		
		em.detach(stu);
		
		em.merge(stu);

//		stu.setName("Moana"); // update statement get out

		em.getTransaction().commit();
		
		em.close();
		
	}
	
	@Test
	@Order(2)
	@DisplayName("find and getReference")
	void test2() {
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		
		var stu = em.find(Student.class, 1);
		stu.setName("Andy");
		
		assertNotNull(stu);
		
		assertEquals(1, stu.getId());
		
//		assertThrows(EntityNotFoundException.class, () -> stu.getName());
		em.getTransaction().commit();
		em.close();
	}
	
	@Test
	@Order(3)
	@DisplayName("update data")
	void test3() {
		
		var em = emf.createEntityManager();
		em.getTransaction().begin();
		
		var stu = new Student();
		stu.setId(3);
		stu.setName("Moana");
		stu.setGender(Gender.Female);
		
		em.merge(stu);
		
		em.getTransaction().commit();
		em.close();
	}
	
	@Test
	@Order(4)
	@DisplayName("remove")
	void test4() {
		
		var em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		var stu = em.find(Student.class, 4);
		
		em.remove(stu); // remove state
		
		em.getTransaction().commit();
		
		em.getTransaction().begin();
		em.persist(stu);
		em.getTransaction().commit();
		
		em.close();
		
	}
	
	@BeforeAll
	static void setUpBeforeClass() {
		emf = Persistence.createEntityManagerFactory("em");
	}
	
	static void tearDownAfterClass() {
		if(null != emf && emf.isOpen())
			emf.close();
	}

}
