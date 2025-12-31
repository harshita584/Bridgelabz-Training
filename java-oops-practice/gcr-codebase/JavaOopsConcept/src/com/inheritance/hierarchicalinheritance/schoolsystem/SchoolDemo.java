package com.inheritance.hierarchicalinheritance.schoolsystem;

public class SchoolDemo {
    public static void main(String[] args) {

        Teacher t1 = new Teacher("Mr. Sharma", 40, "Mathematics");
        Student s1 = new Student("Anita", 16, "10th");
        Staff st1 = new Staff("Ramesh", 35, "Administration");

        t1.displayDetails();
        t1.displayRole();
        System.out.println();

        s1.displayDetails();
        s1.displayRole();
        System.out.println();

        st1.displayDetails();
        st1.displayRole();
    }
}
