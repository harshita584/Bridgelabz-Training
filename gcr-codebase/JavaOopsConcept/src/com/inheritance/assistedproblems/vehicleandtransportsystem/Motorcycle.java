package com.inheritance.assistedproblems.vehicleandtransportsystem;

public class Motorcycle extends Vehicle {
    boolean hasCarrier;

    public Motorcycle(int maxSpeed, String fuelType, boolean hasCarrier) {
        super(maxSpeed, fuelType);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Vehicle Type: Motorcycle");
        System.out.println("Carrier Available: " + hasCarrier);
        System.out.println();
    }
}
