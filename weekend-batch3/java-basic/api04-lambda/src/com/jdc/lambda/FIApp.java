package com.jdc.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FIApp {

	public static void main(String[] args) {
		
		predicate();

	}
	
	static void predicate() {
		Predicate<String> pred1 = s -> s.startsWith("Mg") || s.startsWith("U") || s.startsWith("Ko");
		System.out.println(pred1.test("Keiko") ? "Male" : "Female");
		
		Predicate<Integer> pred2 = i -> i % 2 == 0;
		System.out.println(pred2.test(10) ? "Even" : "Odd");
		
		
	}
	
	static void function() {
		Function<Integer, String> func1 = i -> i + "";
		System.out.println(func1.apply(10).charAt(0));
		
		Function<Integer, Integer> twice = i -> i * 2;
		Function<Integer, Integer> square = i -> i * i;
		
		int result = twice.andThen(square).compose(square).andThen(twice).apply(2);
		
		System.out.println("Result: " + result);
	}
	
	static void supplier() {
		Supplier<String> sup = () -> "Hello Supllier";
		System.out.println(sup.get());
	}
	
	static void consumer() {
//		Consumer<String> con = s -> System.out.println(s);
		
		Consumer<String> con1 = System.out::println;
		Consumer<String> con2 = s -> System.out.print("Hello ".concat(s));
		
		con1.andThen(con2).accept("Kyaw Kyaw");

	}

}
