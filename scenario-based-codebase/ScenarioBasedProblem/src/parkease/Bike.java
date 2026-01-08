package com.parkease;

public class Bike extends Vehicle {

    public Bike(String vehicleNumber) {
        super(vehicleNumber, 20);
    }

    public double calculateCharges(int hours) {
        double penalty = (hours > 3) ? 50 : 0;
        return (baseRate * hours) + penalty;
    }
}

