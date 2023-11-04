package com.jdc.beans.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

@Configuration
public class ScopeJavaConfig {
	
	@Bean(initMethod = "initBean", destroyMethod = "customDestroy")
	@Scope
	@Lazy(true)
	public JavaBean javaBean() {
		return new JavaBean();
	}

}
