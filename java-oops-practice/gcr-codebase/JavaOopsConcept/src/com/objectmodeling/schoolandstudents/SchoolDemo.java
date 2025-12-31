package com.objectmodeling.schoolandstudents;

public class SchoolDemo {
    public static void main(String[] args) {

        // Create school
        School school = new School("Green Valley School");

        // Create students
        Student s1 = new Student("Aarav");
        Student s2 = new Student("Meera");

        // Create courses
        Course c1 = new Course("Mathematics");
        Course c2 = new Course("Science");

        // Add students to school (aggregation)
        school.addStudent(s1);
        school.addStudent(s2);

        // Enroll students in courses (association)
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s2.enrollCourse(c1);

        // Display details
        school.showStudents();
        s1.viewCourses();
        s2.viewCourses();
        c1.showStudents();
        c2.showStudents();
    }
}
