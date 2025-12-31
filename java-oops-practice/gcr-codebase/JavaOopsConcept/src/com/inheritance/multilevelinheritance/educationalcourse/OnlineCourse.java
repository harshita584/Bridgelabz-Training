package com.inheritance.multilevelinheritance.educationalcourse;

class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);   // call parent constructor
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    void displayDetails() {
        super.displayDetails();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + isRecorded);
    }
}
