package com.inheritance.multilevelinheritance.educationalcourse;

class Course {
    String courseName;
    int duration;   // duration in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayDetails() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}
