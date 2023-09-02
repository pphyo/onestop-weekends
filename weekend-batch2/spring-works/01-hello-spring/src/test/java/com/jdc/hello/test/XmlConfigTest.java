package com.jdc.hello.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdc.hello.beans.Employee;

public class XmlConfigTest {
	
	static final String CONFIG = "/home/pphyo/Documents/workspace/onestop-weekends/weekend-batch2/spring-works/01-hello-spring/src/main/resources/hello.xml";
	
	@Test
	void test() {
		
		var context = new ClassPathXmlApplicationContext();
		
		context.setConfigLocation("classpath:/hello.xml");
		context.refresh();
		
		var bean = context.getBean(Employee.class);
		
		System.out.println(
	"%s : %s".formatted(bean.getName(), bean.getEmail())
				);
		
		var str = context.getBean("otherStr", String.class);
		System.out.println(str);
		
		context.close();
	}

}





