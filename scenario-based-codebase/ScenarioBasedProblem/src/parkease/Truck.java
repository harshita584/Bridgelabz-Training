package com.parkease;

public class Truck extends Vehicle {

    public Truck(String vehicleNumber) {
        super(vehicleNumber, 100);
    }

    public double calculateCharges(int hours) {
        double penalty = (hours > 4) ? 200 : 0;
        return (baseRate * hours) + penalty;
    }
}
