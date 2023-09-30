package com.jdc.generic;

import java.util.List;

public class GenericApp {

	public static void main(String[] args) {

		GenericBox<? super String> childBox = new GenericBox<>();
		
		childBox.setData("Hello");

		run();
	}
	
	static void run() {
		@JdcAnnotation(value = "Hello", ok = true)
		Pair<String, String> p1 = new OrderPair<>("Myanmar", "Yangon");
		Pair<String, Integer> p2 = new OrderPair<>("Myanmar", 1111);
		
		System.out.println(compare(p1, p2));
		
		Parent.getList(List.of(1, 2, 3, 4));
				
		new Child().getChildList();
		
		System.out.println(sumTotal(List.of(1.2, 2.4, 3.1)));
		
		List<Integer> list = List.of(1, 2, 3, 4); 
		
		printList(list);
	}
	
	static void printList(List<?> list) {
		for(Object obj : list) {
			System.out.println(obj);
		}
	}
	
	static double sumTotal(List<? extends Number> list) {
		double result = 0;
		for(Number t : list) {
			result += t.doubleValue();
		}
		return result;
	}
	
	@SuppressWarnings("unlikely-arg-type")
	static boolean compare(Pair<String, String> p1, Pair<String, Integer> p2) {
		return p1.getKey().equals(p2.getKey()) && p1.getValue().equals(p2.getValue());
	}
}








