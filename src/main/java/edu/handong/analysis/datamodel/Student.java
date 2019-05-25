package edu.handong.analysis.datamodel;

import java.util.ArrayList;
import java.util.HashMap;

public class Student {
	private String studentId;
	private ArrayList<Course> coursesTaken; // List of courses student has taken
	private HashMap<String,Integer> semestersByYearAndSemester; 

	
	public Student(String studentId) {
		this.studentId = studentId;
	}
	public void addCourse(Course newRecord) {
		coursesTaken.add(newRecord);
	}
	public HashMap<String,Integer> getSemestersByYearAndSemester(){
		return semestersByYearAndSemester;
		
	}
	public int getNumCourseInNthSementer(int semester) {
		int year, semesterCourse, numCourseInNthSementer = 0;
		String yearSemester;
		
		for (Course course : coursesTaken) {
			year = course.getYearTaken();
			semesterCourse = course.getSemesterCourseTaken();
			yearSemester = String.valueOf(year) + "-" + String.valueOf(semesterCourse);
			
			if (semester == semestersByYearAndSemester.get(yearSemester)) {
				numCourseInNthSementer++;
			}
		}
		return numCourseInNthSementer;
		
	}

}
