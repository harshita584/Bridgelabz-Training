package com.objectmodeling.doctorsandpatient;

import java.util.ArrayList;

public class Patient {
    String patientName;
    ArrayList<Doctor> doctors;

    public Patient(String patientName) {
        this.patientName = patientName;
        doctors = new ArrayList<>();
    }

    // Add doctor to patient's consultation list
    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    // View doctors consulted by patient
    public void viewDoctors() {
        System.out.println("Patient: " + patientName + " consulted:");
        for (Doctor d : doctors) {
            System.out.println("Doctor: " + d.doctorName);
        }
        System.out.println();
    }
}

