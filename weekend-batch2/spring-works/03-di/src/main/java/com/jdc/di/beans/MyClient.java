package com.jdc.di.beans;

import org.springframework.stereotype.Component;

import com.jdc.di.beans.qualifier.DIQualifier;
import com.jdc.di.beans.qualifier.QualifyType;

@Component
public class MyClient {
	
	private final MyService service;

	public MyClient(@DIQualifier(QualifyType.THREE) MyService service) {
		this.service = service;
	}
	
//	@Autowired
//	public void setCustomService(MyService service) {
//		this.service = service;
//	}
	
	public void request() {
		service.doService();
	}
}
