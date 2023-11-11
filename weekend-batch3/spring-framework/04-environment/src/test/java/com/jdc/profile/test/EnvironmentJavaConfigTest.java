package com.jdc.profile.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.jdc.profile.ProfileConfig;
import com.jdc.profile.beans.DefaultRepository;
import com.jdc.profile.beans.DevelopmentRepository;
import com.jdc.profile.beans.ReleaseRepository;

public class EnvironmentJavaConfigTest {
	
	@Test
	void test() {
		
		var prop = System.getProperties();
		prop.list(System.out);
		
		try(var context = new AnnotationConfigApplicationContext(ProfileConfig.class)) {
			
			var defBean = context.getBean(DefaultRepository.class);
			assertNotNull(defBean);
			
			var devBean = context.getBean(DevelopmentRepository.class);
			assertNotNull(devBean);
			
			assertThrows(NoSuchBeanDefinitionException.class, () -> context.getBean(ReleaseRepository.class));
			
		}
		
	}

}
