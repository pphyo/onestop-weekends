package com.jdc.mvc.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;

@Configuration
public class DatabaseConfig {

	@Bean
	public SimpleJdbcInsert jdbcInsert(DataSource dataSource) {
		return new SimpleJdbcInsert(dataSource);
	}
	
}
