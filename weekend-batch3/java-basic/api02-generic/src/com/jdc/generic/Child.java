package com.jdc.generic;

public class Child extends Parent {
	
	@SuppressWarnings("unchecked")
	public <T> void getChildList(T... args) {
		if(args.length > 0) {
			System.out.print("Value: ");
			
			int count = 0;
			
			for(T t : args) {
				if(count == args.length - 1) {
					System.out.print(t + ".");
				} else {
					System.out.print(t + ", ");
				}
				
				count++;
			}
		} else {
			System.out.println("Please input data.");
		}
	}
	
	

}
