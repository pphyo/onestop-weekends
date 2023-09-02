package com.jdc.di;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.jdc.di.beans.MyClient;
import com.jdc.di.beans.MyCustomService;
import com.jdc.di.beans.MyDefaultService;
import com.jdc.di.beans.MyService;

@Configuration
public class DIConfig {

	@Bean
	MyClient myClient(MyService service) {
		return new MyClient(service);
	}
	
	@Bean
	MyService defaultService() {
		return new MyDefaultService();
	}
	
	@Bean
	MyService customService() {
		return new MyCustomService();
	}
	
}
