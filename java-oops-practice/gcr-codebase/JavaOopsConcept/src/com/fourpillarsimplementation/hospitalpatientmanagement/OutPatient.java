package com.fourpillarsimplementation.hospitalpatientmanagement;

public class OutPatient extends Patient implements MedicalRecord {

    private double consultationFee;
    private String record;

    public OutPatient(int id, String name, int age, double consultationFee) {
        super(id, name, age);
        this.consultationFee = consultationFee;
    }

    @Override
    double calculateBill() {
        return consultationFee;
    }

    @Override
    public void addRecord(String record) {
        this.record = record;
    }

    @Override
    public void viewRecords() {
        System.out.println("Medical Record: " + record);
    }
}
