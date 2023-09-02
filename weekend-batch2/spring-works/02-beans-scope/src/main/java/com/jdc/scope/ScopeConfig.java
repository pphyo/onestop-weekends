package com.jdc.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeConfig {
	
	@Bean(initMethod = "initMethod")
	@Scope("prototype")
	public MyBean myBean() {
		return new MyBean();
	}

}
