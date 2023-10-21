package com.jdc.lambda;

public class MRApp extends Division {

	public static void main(String[] args) {
		
		// static method reference ( owner::methodName )
		Calculable cal = ReferenceUtil::takeAway;
		System.out.println(cal.calculate(10, 20));
		
		var ru = new ReferenceUtil();
		// instance method reference
		Printable printable = ru::display;
		printable.print("Instance Method Reference");
		
		// constructor reference
		printable = ReferenceUtil::new;
		printable.print("Constructor Reference");
		
		new MRApp().run();
	}
	
	void run() {
		Calculable cal = this::multiply;
		System.out.println(cal.calculate(2, 3));
		
		cal = super::divide;
		System.out.println(cal.calculate(8, 4));
	}
	
	int multiply(int a, int b) {
		return a * b;
	}

}







