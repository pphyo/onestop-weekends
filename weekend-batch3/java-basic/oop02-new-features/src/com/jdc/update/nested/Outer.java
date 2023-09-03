package com.jdc.update.nested;

public class Outer {

	static class StaticInner {
		void doStaticInner() {
			System.out.println("doStaticInner()");
		}
	}
	
	class InstanceInner{
		void doInstanceInner() {
			System.out.println("doInstanceInner");
		}
	}
	
}
