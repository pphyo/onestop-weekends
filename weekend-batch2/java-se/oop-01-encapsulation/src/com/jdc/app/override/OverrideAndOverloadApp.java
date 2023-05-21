package com.jdc.app.override;

public class OverrideAndOverloadApp {
	
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		a = b;
		b = c;
		
		load(a);
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
	}
	
	static void load(A a) {
		System.out.println("A version");
		a.onRun();
	}
	
	static void load(B b) {
		System.out.println("B version");
		b.onRun();
	}
	
	static void load(C c) {
		System.out.println("C version");
		c.onRun();
	}

}

class A {
	void onRun() {
		System.out.println("A runs");
	}
}
class B extends A {
	void onRun() {
		System.out.println("B runs");
	}
}
class C extends B {
	void onRun() {
		System.out.println("C runs");
	}
}