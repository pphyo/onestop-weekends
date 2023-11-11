package com.jdc.profile.beans;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("release")
public class ReleaseRepository implements Repository {

	@Override
	public String getMessage() {
		return "Hello fromRelease Repository";
	}

}
