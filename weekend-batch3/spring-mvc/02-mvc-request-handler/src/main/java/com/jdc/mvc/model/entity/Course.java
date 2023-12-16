package com.jdc.mvc.model.entity;

import lombok.Data;

@Data
public class Course {

	private int id;
	private String name;
	private int duration;
	private Level level;
	private int price;
	
}
