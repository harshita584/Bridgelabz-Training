package com.objectmodeling.universityandfaculties;

public class Faculty {
    String facultyName;
    String specialization;

    public Faculty(String facultyName, String specialization) {
        this.facultyName = facultyName;
        this.specialization = specialization;
    }

    public void displayFaculty() {
        System.out.println("Faculty: " + facultyName +
                           ", Specialization: " + specialization);
    }
}
