package com.jdc.aop.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.app.service.BusinessService;

@SpringJUnitConfig(locations = "classpath:/aop-config.xml")
public class HelloAopTest {

	@Autowired
	private BusinessService service;
	
	@Test
	void test() {
		service.work();
		service.share();
	}
	
}
