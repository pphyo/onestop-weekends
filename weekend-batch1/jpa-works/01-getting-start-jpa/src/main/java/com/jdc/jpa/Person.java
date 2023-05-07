package com.jdc.jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.SecondaryTable;
import javax.persistence.SecondaryTables;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name = "person_tbl", indexes = @Index(columnList = "age"),
uniqueConstraints = {
		@UniqueConstraint(columnNames = {"name"})
})
@SecondaryTables({
	@SecondaryTable(
			name = "second_tbl", 
			uniqueConstraints = @UniqueConstraint(columnNames = "contact"),
			pkJoinColumns = @PrimaryKeyJoinColumn(name = "contact_id")
	),
	@SecondaryTable(
			name = "phone_tbl",
			pkJoinColumns = @PrimaryKeyJoinColumn(name = "phone_id")
	)

})
public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String name;
	private int age;
	@Column(unique = true)
	private double salary;
	
	@Column(table = "second_tbl")
	private String contact;
	
	@Column(table = "phone_tbl")
	private String phone;
	
	private Owner owner;
	
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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}

}
