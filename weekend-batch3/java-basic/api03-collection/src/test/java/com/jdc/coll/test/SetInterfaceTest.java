package com.jdc.coll.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
public class SetInterfaceTest {
	
	static HashSet<Integer> hashSet;
	static TreeSet<Integer> treeSet;
	static LinkedHashSet<Integer> linkedHashSet;
	
	@BeforeAll
	static void start() {
		hashSet = new HashSet<Integer>();
		treeSet = new TreeSet<Integer>();
		linkedHashSet = new LinkedHashSet<Integer>();
	}
	
	@BeforeEach
	void init() {
		for(int i = 20; i > 0; i--) {
			hashSet.add(i);
			treeSet.add(i);
			linkedHashSet.add(i);
		}
	}
	
	@Test
	@Order(1)
	@DisplayName("Test for HashSet")
	void test1() {
		hashSet.add(20);
		hashSet.add(null);
		
		assertFalse(hashSet.isEmpty());
		assertEquals(21, hashSet.size());
		assertTrue(hashSet.contains(18));
		
	}
	
	@Test
	@Order(2)
	@DisplayName("Test for TreeSet")
	void test2() {
		treeSet.add(20);

	}
	
	@Test
	@Order(3)
	@DisplayName("Test for LinkedHashSet")
	void test3() {
		linkedHashSet.add(20);
		linkedHashSet.remove(20);
		linkedHashSet.remove(15);
		linkedHashSet.remove(10);
		
		assertEquals(17, linkedHashSet.size());
	}
	
	@Test
	@Order(4)
	@DisplayName("Test for Set Interface Method")
	void test4() {
		assertTrue(hashSet.containsAll(linkedHashSet));
		assertFalse(linkedHashSet.containsAll(hashSet));
		
		assertTrue(hashSet.retainAll(linkedHashSet));
		assertFalse(linkedHashSet.retainAll(hashSet));
		
		hashSet.clear();
		
		assertTrue(hashSet.isEmpty());
		assertEquals(0, hashSet.size());
	}
	
	@AfterAll
	static void shutdown() {
		System.out.println("HashSet: " + hashSet);
		System.out.println("TreeSet: " + treeSet);
		System.out.println("LinkedHashSet: " + linkedHashSet);
	}
	

}










