package com.skillforge;

import java.util.ArrayList;
import java.util.List;


public class Course {
	String title;
	Instructor instructor;
	double rating;
	List<String> moduleList=new ArrayList<String>();

	public Course(String title, Instructor instructor, double rating) {
		this.title = title;
		this.instructor = instructor;
		this.rating = rating;
		this.moduleList.add("Introduction to the subject");
	}

	public Course(String title, Instructor instructor, double rating, List<String> moduleList) {
		this.title = title;
		this.instructor = instructor;
		this.rating = rating;
		this.moduleList = moduleList;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Instructor getInstructor() {
		return instructor;
	}

	public void setInstructor(Instructor instructor) {
		this.instructor = instructor;
	}

	public double getRating() {
		return rating;
	}

	public void setRating(double rating) {
		this.rating = rating;
	}

	public List<String> getModuleList() {
		return moduleList;
	}

	public void setModuleList(List<String> moduleList) {
		this.moduleList = moduleList;
	}
    
}
