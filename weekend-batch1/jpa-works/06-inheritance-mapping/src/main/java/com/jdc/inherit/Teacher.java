package com.jdc.inherit;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Teacher extends Account {

	private static final long serialVersionUID = 1L;

	@AttributeOverrides(
		{
			@AttributeOverride(column = @Column(name = "primary_address"), name = "address"),
			@AttributeOverride(column = @Column(name = "primary_email"), name = "email"),
			@AttributeOverride(column = @Column(name = "primary_phone"), name = "phone")
		}
	)
	private Address primary;
	@AttributeOverrides(
		{
			@AttributeOverride(column = @Column(name = "secondary_address"), name = "address"),
			@AttributeOverride(column = @Column(name = "secondary_email"), name = "email"),
			@AttributeOverride(column = @Column(name = "secondary_phone"), name = "phone")
		}
	)
	private Address secondary;

	public Address getPrimary() {
		return primary;
	}

	public void setPrimary(Address primary) {
		this.primary = primary;
	}

	public Address getSecondary() {
		return secondary;
	}

	public void setSecondary(Address secondary) {
		this.secondary = secondary;
	}

}
