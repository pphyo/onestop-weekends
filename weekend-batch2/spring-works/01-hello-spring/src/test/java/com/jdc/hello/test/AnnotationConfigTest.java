package com.jdc.hello.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.hello.beans.Employee;
import com.jdc.hello.config.AppConfig;

public class AnnotationConfigTest {
	
	@Test
	void test() {
		try(var context = new AnnotationConfigApplicationContext()) {
			
			context.register(AppConfig.class);
			context.refresh();
			
			var bean = context.getBean("emp1", Employee.class);
			
//			var str = context.getBean(String.class);
//			System.out.println(str);
			
			System.out.println(bean.getName());
			System.out.println(bean.getEmail());
			
		}
	}

}



