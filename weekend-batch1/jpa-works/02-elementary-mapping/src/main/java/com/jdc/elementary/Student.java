package com.jdc.elementary;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapKeyColumn;
import javax.persistence.MapKeyEnumerated;
import javax.persistence.Table;

@Entity
@Table(name = "student")
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private String name;
	private Gender gender;
	private int[] phone;
	@ElementCollection
	@CollectionTable(name = "subjects_marks", joinColumns = @JoinColumn(name = "student_id"))
	private List<Integer> marks;

	@ElementCollection
	@CollectionTable(name = "addresses", joinColumns = @JoinColumn(name = "student_id"))
	@Column(nullable = false)
	private Set<Course> address;

	@ElementCollection
	@CollectionTable(name = "subjects_grade", joinColumns = @JoinColumn(name = "student_id"))
	@Column(name = "grade", nullable = false, columnDefinition = "char(1)")
	@MapKeyColumn(name = "subject", length = 40)
	@MapKeyEnumerated(EnumType.STRING)
	@Enumerated(EnumType.STRING)
	private Map<Subject, Grade> grades;

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

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public int[] getPhone() {
		return phone;
	}

	public void setPhone(int[] phone) {
		this.phone = phone;
	}

	public List<Integer> getMarks() {
		return marks;
	}

	public void setMarks(List<Integer> marks) {
		this.marks = marks;
	}

	public Set<Course> getAddress() {
		return address;
	}

	public void setAddress(Set<Course> address) {
		this.address = address;
	}

	public Map<Subject, Grade> getGrades() {
		return grades;
	}

	public void setGrades(Map<Subject, Grade> grades) {
		this.grades = grades;
	}

	public enum Gender {
		Male, Female, Other
	}

	public enum Subject {
		Myanmar, English, Maths, Chemistry, Physics, Biology
	}

	public enum Grade {
		A, B, C, D
	}

}
