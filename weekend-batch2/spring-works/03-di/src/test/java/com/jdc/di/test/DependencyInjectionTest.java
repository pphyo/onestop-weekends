package com.jdc.di.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jdc.di.DIConfig;
import com.jdc.di.beans.MyClient;

public class DependencyInjectionTest {
	
	@Test
	void test() {
		try(
//			var context = new GenericXmlApplicationContext("classpath:/di.xml")) {
			var context = new AnnotationConfigApplicationContext("com.jdc.di.beans")) {
//			var context = new AnnotationConfigApplicationContext(DIConfig.class)) {
			var bean = context.getBean(MyClient.class);
			bean.request();
		}
	}
	
}





