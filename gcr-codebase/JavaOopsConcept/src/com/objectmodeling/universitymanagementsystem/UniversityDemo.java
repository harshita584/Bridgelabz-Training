package com.objectmodeling.universitymanagementsystem;

public class UniversityDemo {
    public static void main(String[] args) {

        // Create students
        Student s1 = new Student("Aman");
        Student s2 = new Student("Riya");

        // Create professors
        Professor p1 = new Professor("Dr. Sharma");
        Professor p2 = new Professor("Dr. Verma");

        // Create courses
        Course c1 = new Course("Data Structures");
        Course c2 = new Course("Database Systems");

        // Assign professors to courses
        c1.assignProfessor(p1);
        c2.assignProfessor(p2);

        // Students enroll in courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        // Display details
        s1.viewCourses();
        s2.viewCourses();
        p1.viewCourses();
        p2.viewCourses();
        c1.displayCourseDetails();
        c2.displayCourseDetails();
    }
}
