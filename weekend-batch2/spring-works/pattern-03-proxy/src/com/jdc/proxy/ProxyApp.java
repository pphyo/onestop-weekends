package com.jdc.proxy;

public class ProxyApp {
	
	public static void main(String[] args) {
		
		try {
			Internet internet = new MIRouter();
			internet.connect("facebook.com");
			internet.connect("google.com");
			internet.connect("mal.com");
		} catch (Exception e) {
			System.err.println(e.getMessage());
		}
		
	}

}
