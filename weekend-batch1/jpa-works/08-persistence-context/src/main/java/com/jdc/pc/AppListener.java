package com.jdc.pc;

import javax.persistence.PrePersist;

public class AppListener {
	
	@PrePersist
	public void beforePersist(Object obj) {
		System.out.println("Pre Persist");
	}

}
