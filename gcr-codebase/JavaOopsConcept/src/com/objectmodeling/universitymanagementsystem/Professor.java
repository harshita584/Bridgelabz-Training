package com.objectmodeling.universitymanagementsystem;

import java.util.ArrayList;

public class Professor {
    String professorName;
    ArrayList<Course> courses;

    public Professor(String professorName) {
        this.professorName = professorName;
        courses = new ArrayList<>();
    }

    // Add course taught by professor
    public void addCourse(Course course) {
        courses.add(course);
    }

    // View courses taught
    public void viewCourses() {
        System.out.println("Professor: " + professorName);
        for (Course c : courses) {
            System.out.println("Teaches: " + c.courseName);
        }
        System.out.println();
    }
}
