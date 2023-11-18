package com.jdc.servlet.communication.redirect;

public class Hero {
	
	private String name;
	private Role role;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public enum Role {
		Tank, Jungle, Marksman
	}

}
