package com.jdc.coll.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import com.jdc.coll.domain.Item;
import com.jdc.coll.service.ItemService;

@TestMethodOrder(OrderAnnotation.class)
public class SpecialUsageOfCollection {
	
	static ItemService service;
	
	@BeforeAll
	static void init() {
		service = new ItemService(new ArrayList<>());
	}
	
	@ParameterizedTest
	@Order(1)
	@DisplayName("Test for insert")
	@CsvSource({
		"1, Ice Cream, 1500, 150",
		"2, Juice, 3000, 20",
		"3, Cake, 2200, 13",
		"4, Sea Weed, 1800, 29",
		"5, Carabao, 1500, 40",
		"6, Yogurt, 1800, 17",
		"7, Sunflower Seed, 1000, 19"
	})
	void test1(int id, String name, double price, int stock) {
		Item item = new Item();
		item.setId(id);
		item.setName(name);
		item.setPrice(price);
		item.setStock(stock);
		
		assertTrue(service.save(item));

	}

	@Test
	@Order(2)
	@DisplayName("Test for findAll after insert")
	void test2() {
		List<Item> list = service.findAll();
		
		assertNotNull(list);
		assertEquals(7, list.size());
	}
	
	@Test
	@Order(3)
	@DisplayName("Test for unmodifiable and immutable list")
	void test3() {
		var intList = Arrays.asList(5, 2, 8, 6, 3, 9, 1);
		
		var strList = Arrays.asList("Nami", "Luffy", "Zoro", "Sanji");
		
		var itemList = service.findAll();
		
		Collections.sort(intList);
		Collections.sort(strList);
		Collections.sort(itemList, (o1, o2) -> o2.getStock() - o1.getStock());
		
		System.out.println(intList);
		System.out.println(strList);
		
		itemList.forEach(System.out::print);
		
	}
	
	@ParameterizedTest
	@Order(4)
	@DisplayName("Test for delete")
	@MethodSource("getIntArray")
	@Disabled
	void test4(int[] ids) {
		service.deleteAll(ids);
		
		assertEquals(2, service.findAll().size());
	}
	
	@Test
	@Order(5)
	@DisplayName("Remove and update operation while looping in collection")
	@Disabled
	void test5() {
		var updateItem = new Item();
		updateItem.setId(5);
		updateItem.setName("Sunflower Seed");
		updateItem.setPrice(1000);
		updateItem.setStock(100);
		
//		var list = service.findAll();
		
//		for(var item : list) {
//			if(item.getId() == 2)
//				list.set(list.indexOf(item), updateItem);
//		}
		
		service.update(2, updateItem);
		
		var result = service.getItemById(updateItem.getId());
		
		assertNotNull(result);
		assertEquals(updateItem.getId(), result.getId());
		assertEquals(updateItem.getName(), result.getName());
		assertEquals(updateItem.getPrice(), result.getPrice());
		assertEquals(updateItem.getStock(), result.getStock());
	}
	
	@ParameterizedTest
	@Order(6)
	@CsvSource({
		",0,7",
		"s,0,2",
		"s,1500,1"
	})
	void test6(String name, double price, int resultCount) {
		var list = service.findByParams(name, price);
		
		assertEquals(resultCount, list.size());
	}
	
	static Stream<Arguments> getIntArray() {
		return Stream.of(
					Arguments.of(new int[] {1, 2})
				);
	}
}






