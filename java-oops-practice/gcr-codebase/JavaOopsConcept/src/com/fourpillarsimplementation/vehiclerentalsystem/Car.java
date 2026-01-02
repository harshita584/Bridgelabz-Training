package com.fourpillarsimplementation.vehiclerentalsystem;

public class Car extends Vehicle implements Insurable {

    private String insurancePolicyNumber; // sensitive data

    public Car(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    @Override
    public double calculateInsurance(int days) {
        return 200 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Car Insurance Policy: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 3);
    }
}
