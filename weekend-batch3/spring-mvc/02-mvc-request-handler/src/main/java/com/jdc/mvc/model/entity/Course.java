package com.jdc.mvc.model.entity;

import java.time.LocalDate;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class Course {

	private int id;
	private String name;
	private int duration;
	private Level level;
	private int price;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate startDate;
	
}
