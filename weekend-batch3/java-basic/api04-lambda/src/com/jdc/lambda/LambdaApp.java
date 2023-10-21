package com.jdc.lambda;

public class LambdaApp {

	public static void main(String[] args) {
		
		getter();

	}
	
	static void getter() {
		var getter = new Getter<String>() {
			@Override
			public String get() {
				return "Hello Getter Anonymous";
			}
		};
		System.out.println(getter.get());
		
		Getter<Integer> getterLambda = () -> 100;
		System.out.println(getterLambda.get());
	}
	
	static void printable() {
		
		String name = "Mg Mg";
		
		var printable = new Printable() {
			@Override
			public void print(String message) {
				System.out.println(message + name);				
			}
		};
		printable.print("Hello Printable Anonymous");
		
		Printable printableLambda = m -> System.out.println(m);
		printableLambda.print("Hello Printable Lambda");
	}
	
	static void calculable() {
		Calculable cal = (a, b) -> a + b;
		
		System.out.println(cal.calculate(100, 200));
		
		int result = new Calculable() {
			@Override
			public int calculate(int a, int b) {
				return a + b;
			}
		}.calculate(10, 20);
		
		System.out.println(result);
	}

}
