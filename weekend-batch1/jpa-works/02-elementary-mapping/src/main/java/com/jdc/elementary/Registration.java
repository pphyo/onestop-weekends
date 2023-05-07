package com.jdc.elementary;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "registration")
public class Registration implements Serializable {

	private static final long serialVersionUID = 1L;

	@EmbeddedId
	private RegistrationPK id;
	private int regFees;

	public RegistrationPK getId() {
		return id;
	}

	public void setId(RegistrationPK id) {
		this.id = id;
	}

	public int getRegFees() {
		return regFees;
	}

	public void setRegFees(int regFees) {
		this.regFees = regFees;
	}

}
