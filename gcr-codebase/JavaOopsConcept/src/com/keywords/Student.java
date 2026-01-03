package com.keywords;

public class Student {

    // common university name
    static String universityName;
    static int totalStudents = 0;

    // instance variables
    final int rollNumber;   // roll number cannot be changed
    String name;
    char grade;

    // constructor
    public Student(String name, int rollNumber, char grade) {
        this.name = name;
        this.rollNumber = rollNumber;
        this.grade = grade;
        totalStudents++;
    }

    // set university name
    public static void setUniversityName(String name) {
        universityName = name;
    }

    // display total students
    public static void displayTotalStudents() {
        System.out.println("Total Students : " + totalStudents);
    }

    // display student details
    public void displayStudentDetails() {

        // checking object using instanceof
        if (this instanceof Student) {
            System.out.println("University Name : " + universityName);
            System.out.println("Roll Number : " + rollNumber);
            System.out.println("Name : " + name);
            System.out.println("Grade : " + grade);
        }
    }

    // update grade
    public void updateGrade(char newGrade) {

        // instanceof check
        if (this instanceof Student) {
            grade = newGrade;
            System.out.println("Grade updated to : " + newGrade);
        }
    }

    // getters
    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public char getGrade() {
        return grade;
    }

    public static void main(String[] args) {

        // set university
        Student.setUniversityName("Chandigarh University");

        // create student objects
        Student s1 = new Student("Harshita", 101, 'A');
        Student s2 = new Student("Diksha", 102, 'B');

        // display count
        Student.displayTotalStudents();
        System.out.println();

        // display details
        s1.displayStudentDetails();
        System.out.println();
        s2.displayStudentDetails();
        System.out.println();

        // update grade
        s2.updateGrade('A');
        System.out.println();

        // display updated details
        s2.displayStudentDetails();
    }
}
