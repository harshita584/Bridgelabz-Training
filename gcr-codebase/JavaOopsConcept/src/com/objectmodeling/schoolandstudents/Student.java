package com.objectmodeling.schoolandstudents;

import java.util.ArrayList;

public class Student {
    String studentName;
    ArrayList<Course> courses;

    public Student(String studentName) {
        this.studentName = studentName;
        courses = new ArrayList<>();
    }

    // Enroll student in a course (association)
    public void enrollCourse(Course course) {
        courses.add(course);
        course.addStudent(this); // bidirectional association
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

