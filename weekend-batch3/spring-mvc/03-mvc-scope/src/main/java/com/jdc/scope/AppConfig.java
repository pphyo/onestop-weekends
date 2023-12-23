package com.jdc.scope;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;

import com.jdc.scope.data.Counter;

@Configuration
public class AppConfig {
	
	@Bean
	@Scope(value = "application", proxyMode = ScopedProxyMode.TARGET_CLASS)
	Counter appCounter() {
		return new Counter();
	}
	
	@Bean
	@Scope(value = "session", proxyMode = ScopedProxyMode.TARGET_CLASS)
	Counter sesCounter() {
		return new Counter();
	}

	@Bean
	@Scope(value = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
	Counter reqCounter() {
		return new Counter();
	}
	
}
