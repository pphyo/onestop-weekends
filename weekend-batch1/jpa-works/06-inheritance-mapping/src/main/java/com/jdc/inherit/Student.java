package com.jdc.inherit;

import java.awt.Color;

import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.Entity;

@Entity
public class Student extends Account {

	private static final long serialVersionUID = 1L;

	@Convert(converter = ColorConverter.class)
	@Column(nullable = false, length = 50)
	private Color color;
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

}
