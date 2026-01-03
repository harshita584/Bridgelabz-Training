package com.objectmodeling.doctorsandpatient;

import java.util.ArrayList;

public class Doctor {
    String doctorName;
    String specialization;
    ArrayList<Patient> patients;

    public Doctor(String doctorName, String specialization) {
        this.doctorName = doctorName;
        this.specialization = specialization;
        patients = new ArrayList<>();
    }

    // Communication method
    public void consult(Patient patient) {
        System.out.println("Doctor " + doctorName +
                           " is consulting patient " + patient.patientName);

        // Establish association
        patients.add(patient);
        patient.addDoctor(this);
    }

    // View patients consulted by doctor
    public void viewPatients() {
        System.out.println("Doctor: " + doctorName + " consulted:");
        for (Patient p : patients) {
            System.out.println("Patient: " + p.patientName);
        }
        System.out.println();
    }
}
