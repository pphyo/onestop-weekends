package com.jdc.ioc;

import org.springframework.stereotype.Component;

@Component
public class Message {
	
	public Message() {
		System.out.println("Message Default Constructor");
	}
	
	public Message(String data) {
		System.out.println(data);
	}
	
	public void get() {
		System.out.println("This is Message from IOC.");
	}

}
