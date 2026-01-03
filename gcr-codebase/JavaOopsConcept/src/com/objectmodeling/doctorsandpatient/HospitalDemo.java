package com.objectmodeling.doctorsandpatient;

public class HospitalDemo {
    public static void main(String[] args) {

        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor d1 = new Doctor("Dr. Rao", "Cardiologist");
        Doctor d2 = new Doctor("Dr. Sen", "Dermatologist");

        // Create patients
        Patient p1 = new Patient("Amit");
        Patient p2 = new Patient("Neha");

        // Add to hospital
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);
        hospital.addPatient(p1);
        hospital.addPatient(p2);

        // Consultations (association + communication)
        d1.consult(p1);
        d1.consult(p2);
        d2.consult(p1);

        // Display relationships
        d1.viewPatients();
        d2.viewPatients();
        p1.viewDoctors();
        p2.viewDoctors();
    }
}
