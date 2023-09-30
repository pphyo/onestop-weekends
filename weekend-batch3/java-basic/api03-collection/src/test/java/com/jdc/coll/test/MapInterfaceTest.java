package com.jdc.coll.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MapInterfaceTest {
	
	static HashMap<String, String> hashMap = new HashMap<>();
	static TreeMap<String, String> treeMap;
	
	@Test
	@DisplayName("Test for HashMap")
	void test1() {
		hashMap.put("Myanmar", "Yangon");
		hashMap.put("Thai", "Bangkok");
		hashMap.put("Japan", "Tokyo");
		hashMap.put("Phillipine", "Manila");
		hashMap.put("Indonesia", "Jakarta");
		hashMap.put("Myanmar", "Naypyidaw");
		
		assertEquals(5, hashMap.size());
		assertEquals("Bangkok", hashMap.get("Thai"));
		assertTrue(hashMap.containsKey("Myanmar"));
		assertFalse(hashMap.containsValue("Hanoi"));
	}
	
	@Test
	@DisplayName("Test for TreeMap")
	void test2() {
		treeMap = new TreeMap<>(hashMap);
	}
	
	@Test
	@DisplayName("Test for Map Interface method")
	void test3() {
		Set<String> keys = hashMap.keySet();
		keys.forEach(System.out::println);
		
		Collection<String> values = hashMap.values();
		values.forEach(System.out::println);
		
		Set<Entry<String, String>> entry = hashMap.entrySet();
		entry.forEach(e -> {
			System.out.println("%s: %s".formatted(e.getKey(), e.getValue()));
		});
	}
	
	@AfterAll
	static void terminate() {
		System.out.println(hashMap);
		System.out.println(treeMap);
	}

}





