package com.objectmodeling.universitymanagementsystem;

import java.util.ArrayList;

public class Course {
    String courseName;
    Professor professor;
    ArrayList<Student> students;

    public Course(String courseName) {
        this.courseName = courseName;
        students = new ArrayList<>();
    }

    // Communication: assign professor to course
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);
        System.out.println("Professor " + professor.professorName +
                           " assigned to " + courseName);
    }

    // Add student to course
    public void addStudent(Student student) {
        students.add(student);
    }

    // Display course details
    public void displayCourseDetails() {
        System.out.println("Course: " + courseName);
        System.out.println("Professor: " +
                           (professor != null ? professor.professorName : "Not Assigned"));
        System.out.println("Enrolled Students:");
        for (Student s : students) {
            System.out.println("- " + s.studentName);
        }
        System.out.println();
    }
}
