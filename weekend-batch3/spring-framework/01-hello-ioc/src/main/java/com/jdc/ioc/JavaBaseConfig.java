package com.jdc.ioc;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.jdc.ioc.sub")
public class JavaBaseConfig {
	
	@Bean(name = {"str1", "str2", "str3"})
	String string() {
		return "Hello from Java Base.";
	}

}
