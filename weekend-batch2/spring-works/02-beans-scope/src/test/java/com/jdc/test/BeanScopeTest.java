package com.jdc.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jdc.scope.MyBean;
import com.jdc.scope.ScopeConfig;

public class BeanScopeTest {
	
	@Test
	@Disabled
	void test_for_anno_scope() {
		try(var context = new AnnotationConfigApplicationContext()) {
			context.register(ScopeConfig.class);
			context.refresh();
			
			var bean1 = context.getBean(MyBean.class);
			var bean2 = context.getBean(MyBean.class);
			
			assertTrue(bean1 != bean2);
		}
	}

	@Test
	void test_for_xml_scope() {
		
		try(var context = new ClassPathXmlApplicationContext()) {
			
			context.setConfigLocation("classpath:/config/beans.xml");
			context.refresh();
			context.refresh();
			
			var bean1 = context.getBean(MyBean.class);
			var bean2 = context.getBean(MyBean.class);
			
			System.out.println(bean1);
			System.out.println(bean2);
			assertTrue(bean1 == bean2);
			
			
		}
		
	}
}
