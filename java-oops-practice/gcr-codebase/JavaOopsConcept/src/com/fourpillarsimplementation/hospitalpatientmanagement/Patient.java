package com.fourpillarsimplementation.hospitalpatientmanagement;

public abstract class Patient {

    private int patientId;
    private String name;
    private int age;

    // sensitive data (encapsulated)
    private String diagnosis;
    private String medicalHistory;

    public Patient(int patientId, String name, int age) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
    }

    // concrete method
    public void getPatientDetails() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    // protected access for subclasses
    protected void setDiagnosis(String diagnosis) {
        this.diagnosis = diagnosis;
    }

    protected void setMedicalHistory(String history) {
        this.medicalHistory = history;
    }

    protected String getMedicalHistory() {
        return medicalHistory;
    }

    // abstract method
    abstract double calculateBill();
}

