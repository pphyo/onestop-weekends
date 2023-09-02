package com.jdc.factory.obj;

public class UserFactory {

	public static User with() {
		return new User();
	}
	
	public static User withName(String username) {
		var user = new User();
		user.setUsername(username);
		return user;
	}
	
	public static User withNameAndEmail(String username, String email) {
		var user = new User();
		user.setUsername(username);
		user.setEmail(email);
		return user;
	}
	
}
