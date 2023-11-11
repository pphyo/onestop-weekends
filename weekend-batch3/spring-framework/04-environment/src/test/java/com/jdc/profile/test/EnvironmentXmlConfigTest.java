package com.jdc.profile.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.jdc.profile.beans.Repository;

public class EnvironmentXmlConfigTest {
	
	final String XML = "classpath:app-config.xml";
	
	@Test
	void test() {
		System.setProperty("spring.profiles.active", "release");
		try(var context = new GenericXmlApplicationContext(XML)) {
						
//			var environment = context.getEnvironment();
//			environment.setActiveProfiles("release");
			
//			context.load(XML);

//			context.refresh();
			
			var defBean = context.getBean("default", Repository.class);
			assertNotNull(defBean);
			assertEquals("Hello from Default Repository", defBean.getMessage());
			
			var releaseBean = context.getBean("releaseBean", Repository.class);
			assertNotNull(releaseBean);
			
			assertThrows(NoSuchBeanDefinitionException.class, () -> context.getBean("developmentBean", Repository.class));
		}
	}

}
