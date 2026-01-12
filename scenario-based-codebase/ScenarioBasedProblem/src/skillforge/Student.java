package com.skillforge;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends User {
	List<Course> courses =new ArrayList<>();
	double rating;
	Map<String, Integer> marksMap =new HashMap<>();
	String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public Student(String name, int age, String email,double rating) {
		super(name, age, email);
		this.rating=rating;

	}

	public void enrollCourse(Course c) {
		courses.add(c);
	}

	public List<Course> getCourses() {
		return courses;
	}

	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
	public boolean isEligible(Course course) {
		if(this.rating>=course.rating) {
			return true;
		}else {
			return false;
		}
	}
	public boolean hasCourse(Course c) {
        return courses.contains(c);
    }
	public int getMarks(String courseName) {
        return marksMap.get(courseName);
    }
	

}
