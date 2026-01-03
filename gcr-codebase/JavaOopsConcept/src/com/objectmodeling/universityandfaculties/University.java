package com.objectmodeling.universityandfaculties;

import java.util.ArrayList;

public class University {
    String universityName;
    ArrayList<Department> departments;
    ArrayList<Faculty> faculties;

    public University(String universityName) {
        this.universityName = universityName;
        departments = new ArrayList<>();
        faculties = new ArrayList<>();
    }

    // Composition: create and add department
    public void addDepartment(String deptName) {
        departments.add(new Department(deptName));
    }

    // Aggregation: add existing faculty
    public void addFaculty(Faculty faculty) {
        faculties.add(faculty);
    }

    public void displayUniversity() {
        System.out.println("University: " + universityName);

        System.out.println("Departments:");
        for (Department d : departments) {
            d.displayDepartment();
        }

        System.out.println("Faculties:");
        for (Faculty f : faculties) {
            f.displayFaculty();
        }
        System.out.println();
    }

    // Simulate deletion of university
    public void deleteUniversity() {
        departments.clear();   // departments destroyed (composition)
        System.out.println("University deleted. All departments removed.");
    }
}
