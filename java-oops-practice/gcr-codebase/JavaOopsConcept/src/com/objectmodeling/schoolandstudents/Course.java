package com.objectmodeling.schoolandstudents;

import java.util.ArrayList;

public class Course {
    String courseName;
    ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    // Add student to course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display students enrolled in this course
    public void showStudents() {
        System.out.println("Course: " + courseName);
        for (Student s : students) {
            System.out.println("Student: " + s.studentName);
        }
        System.out.println();
    }
}
