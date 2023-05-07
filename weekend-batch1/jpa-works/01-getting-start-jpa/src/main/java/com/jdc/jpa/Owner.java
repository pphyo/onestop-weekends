package com.jdc.jpa;

import java.io.Serializable;

import javax.persistence.Embeddable;

@Embeddable
public class Owner implements Serializable {

	private static final long serialVersionUID = 1L;

	private String ownerName;
	private String pos;

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getPos() {
		return pos;
	}

	public void setPos(String pos) {
		this.pos = pos;
	}

}
