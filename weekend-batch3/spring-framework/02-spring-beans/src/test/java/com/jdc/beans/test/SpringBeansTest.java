package com.jdc.beans.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jdc.beans.MyService;
import com.jdc.beans.MyServiceInstanceFactory;

public class SpringBeansTest {
	
	@Test
	@DisplayName("Factory method bean creation test with xml config")
	void test1() {
		try(var context = new GenericXmlApplicationContext("classpath:beans.xml")) {
			
			var bean = context.getBean("instanceFactoryBeanWithArg", MyService.class);
			bean.work();
			
			System.out.println(context.getBean(MyServiceInstanceFactory.class));
			
		}
		
	}

}
