package com.inheritance.hybridinheritance.vehiclemanagement;

class PetrolVehicle extends Vehicle implements Refuelable {

    PetrolVehicle(int maxSpeed, String model) {
        super(maxSpeed, model);
    }

    public void refuel() {
        System.out.println("Petrol vehicle is being refueled.");
    }
}
