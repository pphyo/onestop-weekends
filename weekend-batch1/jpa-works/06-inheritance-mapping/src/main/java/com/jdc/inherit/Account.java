package com.jdc.inherit;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import static javax.persistence.InheritanceType.SINGLE_TABLE;
import javax.persistence.DiscriminatorColumn;
import static javax.persistence.DiscriminatorType.INTEGER;;

@Entity
@Inheritance(strategy = SINGLE_TABLE)
@DiscriminatorColumn(name = "account_discriminator", discriminatorType = INTEGER)
public abstract class Account implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	@Column(nullable = false, length = 50)
	private String name;
	@Column(nullable = false, name = "login_id", length = 30)
	private String loginId;
	@Column(nullable = false, length = 30)
	private String password;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
