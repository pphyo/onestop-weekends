package com.jdc.aop.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.aop.beans.BusinessBean;
import com.jdc.aop.config.AopConfig;

@SpringJUnitConfig(classes = AopConfig.class)
public class HelloAopTest {
	
	@Autowired
	BusinessBean bean;
	
	@Test
	void test() {
//		bean.doBusinessForBefore("AspectJ Sytle", 0);
//		bean.doBusinessForAfterReturning("Master Data");
		bean.doBusinessForAfterThrowing();
	}

}
