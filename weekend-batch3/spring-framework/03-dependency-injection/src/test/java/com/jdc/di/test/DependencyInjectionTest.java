package com.jdc.di.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.jdc.di.DIConfig;
import com.jdc.di.beans.DIClient;

@SpringJUnitConfig(DIConfig.class)
public class DependencyInjectionTest {

	@Autowired
	DIClient client;
	
	@Test
	void test_for_explicit_wiring() {
		client.doWork("Explicit Wiring");
	}

}
