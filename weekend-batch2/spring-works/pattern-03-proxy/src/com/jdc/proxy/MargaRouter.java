package com.jdc.proxy;

public class MargaRouter implements Internet {

	@Override
	public void connect(String host) {
		System.out.println("Connected to %s.".formatted(host));	
	}

}
