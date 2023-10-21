package com.jdc.ioc.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jdc.ioc.JavaBaseConfig;
import com.jdc.ioc.Message;
import com.jdc.ioc.sub.Data;
import com.jdc.ioc.sub.NoBean;

public class HelloIocTest {
	
	final String LOCATION = "classpath:/beans.xml";
	
	@Test
	@Disabled
	void test_for_java_base_config() {
		
		try(var context = new AnnotationConfigApplicationContext(JavaBaseConfig.class)) {
			
			var str = context.getBean(String.class);
			
			assertNotNull(str);
			assertEquals("Hello from Java Base.", str);
			
			assertThrows(NoSuchBeanDefinitionException.class, 
					() -> context.getBean(Message.class));
			
			var data = context.getBean(Data.class);
			assertNotNull(data);
			
		}
		
	}
	
	@Test
	@Disabled
	void test_for_annotation_config() {
		
		try(var context = new AnnotationConfigApplicationContext()) {
			
			context.scan("com.jdc.ioc.sub");
			context.refresh();
			
//			var message = context.getBean(Message.class);
//			assertNotNull(message);
			
			assertThrows(NoSuchBeanDefinitionException.class, 
						() -> context.getBean(Message.class));
			
			var data = context.getBean(Data.class);
			assertNotNull(data);
			
			assertThrows(NoSuchBeanDefinitionException.class, 
						() -> context.getBean(NoBean.class));
			
		}
		
	}
	
	@Test
	void test_for_xml_config() {
		
		try(var context = new GenericXmlApplicationContext(LOCATION)) {
			
			var str = context.getBean(String.class);
			System.out.println(str);
			
			var message = context.getBean(Message.class);
			message.get();
			
		}
		
	}

}
