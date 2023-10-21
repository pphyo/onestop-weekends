package com.jdc.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalOperation {
	
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		var intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		reduce(intList);
		
		var unorderList = List.of("Markyyy", "Albert", "Naomi", "Kiboy",
				"Kairi", "Butss", "Sanz", "Clayyy");
		
		var orderList = List.of("A Phoo", "Bloyski", "Cala", "Derek",
				"Emily", "Skylar", "Zack");
		
		System.out.println(find(unorderList));
		
//		collectString(unorderList);
//		collectInt(intList);
	}
	
	static Optional<String> find(List<String> list) {
		return list.stream().filter(s -> s.length() > 5).findAny();
	}
	
	static void collectInt(List<Integer> list) {
		var result = list.stream().collect(Collectors.groupingBy(i -> i > 5));
		System.out.println(result);
	}
	
	static void collectString(List<String> list) {
		var sb = new StringBuilder();
		sb.append("a");
		sb.append("b");
		
		var result = list.stream()
						 .filter(s -> s.length() > 5)
						 .collect(Collectors.joining());
		
		System.out.println(result);
	}
	
	static void takeWhile(List<String> list) {
		list.parallelStream().dropWhile(s -> s.length() > 6).forEachOrdered(System.out::println);
	}
	
	static void reduce(List<Integer> list) {
		var result = list.stream()
						 .reduce(
								 (a, b) -> a * b
								 );
		result.filter(i -> i > 0).ifPresentOrElse(
				a -> System.out.println("Result: " + a), 
				() -> System.out.println("Something Wrong!")
				);
	}
	
	static void flatMap() {
		List<List<Integer>> list = new ArrayList<>();
		list.add(Arrays.asList(1, 2, 3));
		list.add(Arrays.asList(4, 5, 6));
		list.add(Arrays.asList(7, 8, 9, 10));
		
		list.stream()
			.flatMap(l -> l.stream().map(i -> i))
			.filter(i -> i % 2 == 0)
			.forEach(System.out::println);
	}
	
	static boolean isEven(int i) {
		return i % 2 == 0;
	}

}











