package com.jdc.beans.test;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jdc.beans.scope.AnnotationBean;
import com.jdc.beans.scope.JavaBean;
import com.jdc.beans.scope.ScopeJavaConfig;
import com.jdc.beans.scope.XmlSuperBean;

public class BeanScopeTest {
	
	@Test
	void testXml() {
		try(var context = new GenericXmlApplicationContext("classpath:scope-config.xml")) {
			
			var bean1 = context.getBean(XmlSuperBean.class);
			var bean2 = context.getBean(XmlSuperBean.class);
			
			System.out.println(bean1);
			System.out.println(bean2);
			
			assertTrue(bean1 == bean2);
			
		}
	}
	
	@Test
	void testAnnotation() {
		try(var context = new AnnotationConfigApplicationContext("com.jdc.beans.scope")) {
			
			var bean1 = context.getBean(AnnotationBean.class);
			var bean2 = context.getBean(AnnotationBean.class);
			
			System.out.println(bean1);
			System.out.println(bean2);
			
			assertTrue(bean1 == bean2);

		}
	}
	
	@Test
	void testJava() {
		try(var context = new AnnotationConfigApplicationContext(ScopeJavaConfig.class)) {
			
			var bean1 = context.getBean(JavaBean.class);
			var bean2 = context.getBean(JavaBean.class);
			
			assertTrue(bean1 == bean2);

		}
	}

}
