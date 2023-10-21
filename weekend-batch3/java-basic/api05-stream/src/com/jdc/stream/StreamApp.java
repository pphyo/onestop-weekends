package com.jdc.stream;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamApp {

	public static void main(String[] args) throws IOException {
		
		System.out.println(Arrays.stream(new int[] {1, 2, 3, 4, 5}).sum());
		
//		var intList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		
		List<String> list = Arrays.asList(
				"Ko Zaw", "Khin Thidar", "Nyi Nyi", 
				"Aung Ko", "Min Thu", "Yin Hla", 
				"Thidar Htwe", "Khin Thidar");

		list.stream()
				.filter(s -> s.contains("Thidar") || s.contains("Ko"))
				.sorted()
				.distinct()
				.limit(2)
				.skip(1)
				.forEach(System.out::println);
		
		String text = """
				Apple, Red, 5
				Orange, Orange, 2
				Dragon Fruit, Red, 6
				Coconut, White, 14
				Grape, Purple, 15
				Strawberry, Red, 1
				Berry, Purple, 4
				""";
		
		convertFromText(text);
		
		var result = convertFromFile().mapToDouble(fruit -> fruit.getWeight()).average();
		
		result.ifPresentOrElse(
				d -> System.out.println("Average weight of fruits is %.3fg.".formatted(d)), 
				() -> System.out.println("No fruit available!")
				);
		
		long count = convertFromFile().filter(f -> f.getColor().equals("Red")).count();
		
		System.out.println("Total Count: " + count);
		
	}
	
	static Stream<Fruit> convertFromFile() throws IOException {
		return Files.lines(new File("fruits.txt").toPath()).map(Fruit::new);
	}
	
	static void convertFromText(String text) {
		text.lines().map(s -> {
			String[] arr = s.split(",");
			var fruit = new Fruit();
			fruit.setName(arr[0].trim());
			fruit.setColor(arr[1].trim());
			fruit.setWeight(Double.parseDouble(arr[2].trim()));
			
			return fruit;
		}).filter(f -> f.getColor().equals("Red"))
		.forEach(System.out::println);
	}

}







