package com.generics.coursemanagementsystem;

public class DriverClass {
	public static void main(String[] args) {
		Course<ExamCourse> examCourse = new Course<ExamCourse>("Exam 1", 2, new ExamCourse());
		System.out.println(examCourse);
		
		Course<AssignmentCourse> assignmentCourse = new Course<AssignmentCourse>("Assignment 1", 1, new AssignmentCourse());
		System.out.println(assignmentCourse);
		
		Course<ResearchCourse> researchCouse = new Course<ResearchCourse>("Research 1", 4, new ResearchCourse());
		System.out.println(researchCouse);
	}
}
