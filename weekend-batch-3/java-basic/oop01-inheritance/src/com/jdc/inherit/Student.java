package com.jdc.inherit;

public class Student extends Person {
	
	public static String rollNo = "RN-10";
	public int avgMark = 200;
	
	public static void gotoExam() {
		System.out.println("Student go to exam with " + rollNo);
	}
	
	public void study() {
		System.out.println("Stduent: " + rollNo);
		System.out.println("Student: " + avgMark);
	}

}
