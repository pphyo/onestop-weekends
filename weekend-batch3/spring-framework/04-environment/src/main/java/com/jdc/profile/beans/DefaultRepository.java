package com.jdc.profile.beans;

import org.springframework.stereotype.Component;

@Component
public class DefaultRepository implements Repository {

	@Override
	public String getMessage() {
		return "Hello from Default Repository";
	}

}
