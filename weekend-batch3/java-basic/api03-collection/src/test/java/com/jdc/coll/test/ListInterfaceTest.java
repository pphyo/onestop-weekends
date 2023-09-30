package com.jdc.coll.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ListInterfaceTest {
	
	static ArrayList<Integer> arrayList;
	static LinkedList<Integer> linkedList;
	
	@BeforeAll
	static void start() {
		arrayList = new ArrayList<>();
		linkedList = new LinkedList<>();
		
		Collections.addAll(arrayList, 10, 8, 6, 4, 2, 1, 3, 5, 7, 9);
		linkedList.addAll(arrayList);
	}
	
	@Test
	@DisplayName("Test for ArrayList")
	void test1() {
		arrayList.add(2, 10);
		arrayList.add(100);
		arrayList.add(10);
		
		assertFalse(arrayList.isEmpty());
		assertEquals(13, arrayList.size());
		assertEquals(0, arrayList.indexOf(10));
		assertEquals(arrayList.size() - 1, arrayList.lastIndexOf(10));
		
		assertEquals(1, arrayList.remove(6));
		assertEquals(12, arrayList.size());
		
		assertThrows(IndexOutOfBoundsException.class, () -> arrayList.remove(100));
		
		assertTrue(arrayList.remove(Integer.valueOf(100)));
		
		assertEquals(10, arrayList.set(0, 100));
	}
	
	@Test
	@DisplayName("Test for LinkedList")
	void test2() {
		
	}
	
	@AfterAll
	static void shutdown() {
		System.out.println(arrayList);
		System.out.println(linkedList);
	}

}




