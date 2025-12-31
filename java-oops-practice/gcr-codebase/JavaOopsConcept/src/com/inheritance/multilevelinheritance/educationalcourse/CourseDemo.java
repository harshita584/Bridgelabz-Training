package com.inheritance.multilevelinheritance.educationalcourse;

public class CourseDemo {
    public static void main(String[] args) {

        PaidOnlineCourse c1 = new PaidOnlineCourse(
            "Java Programming", 8, "Coursera", true, 5000, 1000 );

        c1.displayDetails();
    }
}
