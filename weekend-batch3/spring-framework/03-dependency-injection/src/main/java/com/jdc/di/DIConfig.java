package com.jdc.di;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.jdc.di.beans.BaseService;
import com.jdc.di.beans.DIClient;
import com.jdc.di.beans.DIDefaultService;
import com.jdc.di.beans.DIService;

@Configuration
@ComponentScan
public class DIConfig {
	
//	@Bean
//	public BaseService diService() {
//		return new DIService();
//	}
//	
//	@Bean
//	public BaseService defaultService() {
//		return new DIDefaultService();
//	}
//	
//	@Bean
//	public DIClient client(BaseService service) {
////		var client = new DIClient(service);
////		client.setService(service);
//		return new DIClient();
//	}

}
