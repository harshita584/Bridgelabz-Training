package com.objectmodeling.universitymanagementsystem;

import java.util.ArrayList;

public class Student {
    String studentName;
    ArrayList<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        courses = new ArrayList<>();
    }

    // Communication: student enrolls in a course
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this);
        System.out.println(studentName + " enrolled in " + course.courseName);
    }

    // View enrolled courses
    public void viewCourses() {
        System.out.println("Student: " + studentName);
        for (Course c : courses) {
            System.out.println("Enrolled in: " + c.courseName);
        }
        System.out.println();
    }
}

