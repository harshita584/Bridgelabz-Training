package com.objectmodeling.universityandfaculties;

public class UniversityDemo {
    public static void main(String[] args) {

        // Create independent faculty members
        Faculty f1 = new Faculty("Dr. Sharma", "Computer Science");
        Faculty f2 = new Faculty("Dr. Mehta", "Physics");

        // Create university
        University uni = new University("National University");

        // Add departments (composition)
        uni.addDepartment("Engineering");
        uni.addDepartment("Science");

        // Add faculty (aggregation)
        uni.addFaculty(f1);
        uni.addFaculty(f2);

        // Display details
        uni.displayUniversity();

        // Delete university
        uni.deleteUniversity();

        // Faculty still exists independently
        System.out.println("Faculty still exists after university deletion:");
        f1.displayFaculty();
        f2.displayFaculty();
    }
}
