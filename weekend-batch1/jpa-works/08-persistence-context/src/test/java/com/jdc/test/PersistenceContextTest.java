package com.jdc.test;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.jdc.pc.Account;

public class PersistenceContextTest {
	
	static EntityManagerFactory emf;
	
	@Test
	@Disabled
	void test_for_callback() {
		
		var em = emf.createEntityManager();		
		em.getTransaction().begin();
		
		var acc = new Account();
		acc.setName("Calara");
		acc.setAmount(200000);
		
		em.persist(acc);
		
		acc.setName("Zara");
		
		em.getTransaction().commit();
		em.close();
		
	}
	
	@Test
	void test_for_flush_and_refresh() {
		
		var t1 = getThreadOne();
		var t2 = getThreadTwo();
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
	
	private Thread getThreadOne() {
		return new Thread(() -> {
			
			var em = emf.createEntityManager();
			var acc = em.find(Account.class, 1);
			
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			em.getTransaction().begin();
			System.out.println("Before thread one : Balance of %s is %d."
					.formatted(acc.getName(), acc.getAmount()));
			
			acc.setAmount(acc.getAmount() + 100_000);
			em.flush();
			System.out.println("After thread one : Balance of %s is %d."
					.formatted(acc.getName(), acc.getAmount()));

			em.getTransaction().commit();
			
		}, "Thread one starts...");
	}

	private Thread getThreadTwo() {
		return new Thread(() -> {
			
			var em = emf.createEntityManager();
			var acc = em.find(Account.class, 1);
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			em.getTransaction().begin();
			System.out.println("Before thread two : Balance of %s is %d."
					.formatted(acc.getName(), acc.getAmount()));
			
			em.refresh(acc);
			acc.setAmount(acc.getAmount() - 50_000);
			System.out.println("After thread two : Balance of %s is %d."
					.formatted(acc.getName(), acc.getAmount()));
			
			em.getTransaction().commit();
			
		}, "Thread two starts...");
	}
	
	@BeforeAll
	static void init() {
		emf = Persistence.createEntityManagerFactory("pc");
	}
	
	@AfterAll
	static void shutdown() {
		if(null != emf && emf.isOpen())
			emf.close();
	}

}
