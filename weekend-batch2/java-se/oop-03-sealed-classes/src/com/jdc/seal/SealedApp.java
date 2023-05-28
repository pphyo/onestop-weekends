package com.jdc.seal;

import com.jdc.seal.other.Triangle;

public class SealedApp {
	
	public static void main(String[] args) {
		
		var tri = new Triangle(5, 8);
		
		var area = tri.area();
		
		System.out.println(area);
		
	}

}
