package com.fourpillarsimplementation.hospitalpatientmanagement;

public class Main {
    public static void main(String[] args) {

        Patient p1 = new InPatient(101, "Amit", 45, 5, 2000);
        Patient p2 = new OutPatient(102, "Riya", 30, 800);

        Patient[] patients = {p1, p2};

        for (Patient p : patients) {
            p.getPatientDetails();
            System.out.println("Bill Amount: Rs." + p.calculateBill());
        }
    }
}

