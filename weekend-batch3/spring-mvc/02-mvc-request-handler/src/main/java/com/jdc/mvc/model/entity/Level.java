package com.jdc.mvc.model.entity;

public enum Level {
	BASIC("Basic"), INTERMEDIATE("Intermediate"), ADVANCED("Advanced");
	
	private String courseLevel;
	
	private Level(String level) {
		this.courseLevel = level;
	}
	
	public String getLevel() {
		return courseLevel;
	}
}
