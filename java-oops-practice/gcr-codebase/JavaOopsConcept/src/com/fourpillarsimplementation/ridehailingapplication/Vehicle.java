package com.fourpillarsimplementation.ridehailingapplication;

public abstract class Vehicle {

    private int vehicleId;
    private String driverName;
    protected double ratePerKm;

    public Vehicle(int vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // concrete method
    public void getVehicleDetails() {
        System.out.println("Vehicle ID: " + vehicleId);
        System.out.println("Driver Name: " + driverName);
        System.out.println("Rate per Km: Rs." + ratePerKm);
    }

    // abstract method
    public abstract double calculateFare(double distance);
}

