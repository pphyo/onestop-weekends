package com.jdc.di.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class DIClient {
	
	@Autowired
	@Qualifier("optional")
	private BaseService service;
	
//	@Autowired
//	public DIClient(@Qualifier("main") BaseService service) {
//		this.service = service;
//	}
	
//	public void setService(DIService diService) {
//		this.service = diService;
//	}
	
	public void doWork(String data) {
		service.doService(data);
	}

}
