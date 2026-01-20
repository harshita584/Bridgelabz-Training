package com.generics.coursemanagementsystem;

public class Course<T extends CourseType>{
	String name;
	int duration;
	T courseType;
	
	public String toString() {
		return name + " " + duration + " " + courseType.getType();
	}

	public Course(String name, int duration, T courseType) {
		this.name = name;
		this.duration = duration;
		this.courseType = courseType;
	}
}
