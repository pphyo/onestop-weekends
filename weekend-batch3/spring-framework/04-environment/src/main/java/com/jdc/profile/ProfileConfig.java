package com.jdc.profile;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jdc.profile.beans.DefaultRepository;
import com.jdc.profile.beans.DevelopmentRepository;
import com.jdc.profile.beans.ReleaseRepository;
import com.jdc.profile.beans.Repository;

@Configuration
//@ComponentScan
public class ProfileConfig {
	
	@Bean
	public Repository defaultRepository() {
		return new DefaultRepository();
	}
	
	@Bean
	@Profile("development")
	public Repository develpment() {
		return new DevelopmentRepository();
	}
	
	@Bean
	@Profile("release")
	public Repository release() {
		return new ReleaseRepository();
	}

}
