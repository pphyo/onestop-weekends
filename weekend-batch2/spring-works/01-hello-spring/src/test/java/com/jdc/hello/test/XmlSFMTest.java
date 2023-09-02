package com.jdc.hello.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jdc.hello.beans.Employee;

public class XmlSFMTest {
	
	@Test
	void test() {
		try(var context = new GenericXmlApplicationContext("classpath:/hello.xml")) {
			
			var bean = context.getBean(Employee.class);
			
			assertNotNull(bean);
//			assertEquals("Tut Pi", bean.getName());
			assertEquals("jdc@gmail.com", bean.getEmail());
			
		}
	}

}


