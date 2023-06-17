package com.jdc.hello.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jdc.hello.Employee;

public class HelloSpringTest {
	
	@Test
	void test() {
		
		var context = new GenericXmlApplicationContext("classpath:/hello.xml");
		
		var bean = context.getBean("employee", Employee.class);
		bean.setName("Mg Mg");
		bean.setEmail("mgmg@gmail.com");
		
		System.out.println(
	"%s : %s".formatted(bean.getName(), bean.getEmail())
				);
		
		context.close();
	}

}





