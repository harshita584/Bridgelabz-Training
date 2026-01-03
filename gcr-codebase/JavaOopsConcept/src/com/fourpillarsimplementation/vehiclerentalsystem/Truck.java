package com.fourpillarsimplementation.vehiclerentalsystem;

public class Truck extends Vehicle implements Insurable {

    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, double rentalRate, String policyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = policyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return (rentalRate * days) + 500; // extra loading charge
    }

    @Override
    public double calculateInsurance(int days) {
        return 300 * days;
    }

    @Override
    public String getInsuranceDetails() {
        return "Truck Insurance Policy: ****" + insurancePolicyNumber.substring(insurancePolicyNumber.length() - 3);
    }
}
