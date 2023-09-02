package com.jdc.inherit;

public class StudentChild extends Student {
	
	public static String rollNo = "RNC-200";
	public int avgMark = 300;
	
	public void study() {
		System.out.println("Student Child: " + rollNo);
		System.out.println("Student Child: " + avgMark);
	}
	
	public static void gotoExam() {
		System.out.println("Student Child go to exam with " + rollNo);
	}
	
}
