package com.jdc.jdbc.model.dto;

import java.time.LocalDate;

public class User {

	private int id;
	private String name;
	private LocalDate birthDate;
	private String email;
	private String phone;

	public User(int id, String name, LocalDate birthDate, String email, String phone) {
		super();
		this.id = id;
		this.name = name;
		this.birthDate = birthDate;
		this.email = email;
		this.phone = phone;
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public String getEmail() {
		return email;
	}

	public String getPhone() {
		return phone;
	}

}
