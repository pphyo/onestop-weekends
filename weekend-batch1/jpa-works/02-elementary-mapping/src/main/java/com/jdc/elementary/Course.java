package com.jdc.elementary;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name = "course")
public class Course implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	@Column(name = "course_name", nullable = false, unique = true, length = 45)
	private String name;
	@Enumerated(EnumType.STRING)
	@Column(nullable = false, length = 20)
	private Level level;
	@Column(nullable = true, columnDefinition = "tinyint check(months > 3)")
	private int months;
	@Column(columnDefinition = "DECIMAL(9, 2) default 0.0")
	private double fees;
	@Column(nullable = true)
	private boolean available;

	@Lob
	private String description;
	
	@Transient
	private boolean count;

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

	public Level getLevel() {
		return level;
	}

	public void setLevel(Level level) {
		this.level = level;
	}

	public int getMonths() {
		return months;
	}

	public void setMonths(int months) {
		this.months = months;
	}

	public double getFees() {
		return fees;
	}

	public void setFees(double fees) {
		this.fees = fees;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCount() {
		return count;
	}

	public void setCount(boolean count) {
		this.count = count;
	}

	public enum Level {
		Basic, Intermediate, UpperIntermediate, Advanced
	}

}
