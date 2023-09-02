package com.jdc.singleton;

import java.util.Objects;

public class Client {

	private String name;
	private int token;
	private String phone;

	public Client(String name, int token, String phone) {
		super();
		this.name = name;
		this.token = token;
		this.phone = phone;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name, phone);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Client other = (Client) obj;
		return Objects.equals(name, other.name) && Objects.equals(phone, other.phone);
	}

	public String getName() {
		return name;
	}

	public int getToken() {
		return token;
	}

	public String getPhone() {
		return phone;
	}

}
