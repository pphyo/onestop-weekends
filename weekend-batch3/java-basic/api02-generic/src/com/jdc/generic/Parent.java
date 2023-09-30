package com.jdc.generic;

import java.util.List;

public class Parent extends GrandParent {
	
	public static <T extends Number> void getList(List<T> list) {
		for(T t : list) {
			System.out.println(t);
		}
	}

}
