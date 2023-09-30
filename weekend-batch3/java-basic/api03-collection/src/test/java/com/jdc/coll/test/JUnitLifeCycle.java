package com.jdc.coll.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class JUnitLifeCycle {
	
	@BeforeAll
	static void setUpBeforeClass() {
		System.out.println("Before All");
	}

	@BeforeEach
	void setUp() {
		System.out.println("Before Each");
	}

	@AfterEach
	void tearDown() {
		System.out.println("After Each");
	}
	
	@AfterAll
	static void tearDownAfterClass() {
		System.out.println("After All");
	}
	
	@Test
	@Order(2)
	@DisplayName("Test for 1 equals to 1")
	void test2() {
		assertEquals(1, 1);
	}

	@Test
	@Order(2)
	@Disabled
	void test1() {
		System.out.println("Test One");
	}

}
