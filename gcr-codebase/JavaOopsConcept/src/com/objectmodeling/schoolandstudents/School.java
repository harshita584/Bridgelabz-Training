package com.objectmodeling.schoolandstudents;

import java.util.ArrayList;

public class School {
    String schoolName;
    ArrayList<Student> students;

    public School(String schoolName) {
        this.schoolName = schoolName;
        students = new ArrayList<>();
    }

    // Add student to school (aggregation)
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display all students
    public void showStudents() {
        System.out.println("School: " + schoolName);
        for (Student s : students) {
            System.out.println("Student: " + s.studentName);
        }
        System.out.println();
    }
}

