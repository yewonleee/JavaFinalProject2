package edu.handong.analysis.datamodel;

import java.util.ArrayList;

public class Course {
	private String studentId;
	private String yearMonthGraduated;
	private String firstMajor;
	private String secondMajor;
	private String courseCode;
	private String courseName;
	private String courseCredit;
	private int yearTaken;
	private int semesterCourseTaken;

	public Course(String line) {
		ArrayList<String> courseList = new ArrayList<String>();
		
		String[] split = line.trim().split(", ");
		for (String el : split) {
			courseList.add(el);
		}
		
		studentId = courseList.get(0);
		yearMonthGraduated = courseList.get(1);
		firstMajor = courseList.get(2);
		secondMajor = courseList.get(3);
		courseCode = courseList.get(4);
		courseName = courseList.get(5);
		courseCredit = courseList.get(6);
		yearTaken = Integer.parseInt(courseList.get(7));
		semesterCourseTaken = Integer.parseInt(courseList.get(8));
	}
	
	public int getYearTaken() {
		return yearTaken;
	}
	
	public int getSemesterCourseTaken() {
		return semesterCourseTaken;
	}

}
