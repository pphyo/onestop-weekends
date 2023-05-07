package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import com.jdc.jpql.Author;
import com.jdc.jpql.Book;
import com.jdc.jpql.Author.Gender;

public class JpqlTest {
	
	static EntityManagerFactory emf;
	EntityManager em;
	
	@Test
	void test_for_update() {
		em.getTransaction().begin();
		
		String jpql = "update Category c set c.name = :name where c.id = :id";
		var query = em.createQuery(jpql);
		query.setParameter("name", "Sci-Fi");
		query.setParameter("id", 6);
		query.executeUpdate();
		
		String delete = "delete from Category c where c.id = :id";
		query = em.createQuery(delete);
		query.setParameter("id", 6);
		query.executeUpdate();
		
		em.getTransaction().commit();
	}
	
	@ParameterizedTest
	@ValueSource(ints = 1)
	void test(int id) {
		String jpql = "select u from Author u where id = :id and gender = :gender";
		var query = em.createQuery(jpql, Author.class);
		query.setParameter("id", id);
		query.setParameter("gender", Gender.Male);
		var author = query.getSingleResult();
//		assertEquals(1, count.size());
		assertNotNull(author);
		assertEquals("Yann Martel", author.getName());
	}
	
	@ParameterizedTest
	@ValueSource(ints = 1)
	void test_for_named_query(int id) {
		var query = em.createNamedQuery("Book.findAll", Book.class);
		var result = query.getResultList();
		assertEquals(11, result.size());
		
		query = em.createNamedQuery("Book.findById", Book.class);
		query.setParameter("id", id);
		var book = query.getSingleResult();
		assertAll(
					() -> assertEquals("Life of Pi", book.getTitle()),
					() -> assertEquals("I00001", book.getIsbn()),
					() -> assertEquals(15000, book.getPrice())
				);
	}
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("jpql");
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
	
	@AfterAll
	static void shutdown() {
		if(null != emf && emf.isOpen())
			emf.close();
	}

}
