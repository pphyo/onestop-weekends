package com.jdc.profile.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("development")
public class DevelopmentRepository implements Repository {
	
	@Override
	public String getMessage() {
		return "Hello from Development Repository";
	}

}
