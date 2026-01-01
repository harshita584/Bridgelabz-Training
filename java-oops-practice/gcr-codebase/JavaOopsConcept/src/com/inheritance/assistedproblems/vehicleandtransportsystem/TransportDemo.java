package com.inheritance.assistedproblems.vehicleandtransportsystem;

public class TransportDemo {
    public static void main(String[] args) {

        // Array of superclass type
        Vehicle[] vehicles = new Vehicle[3];

        vehicles[0] = new Car(180, "Petrol", 5);
        vehicles[1] = new Truck(120, "Diesel", 12.5);
        vehicles[2] = new Motorcycle(160, "Petrol", true);

        // Polymorphic method calls
        for (Vehicle v : vehicles) {
            v.displayInfo();
        }
    }
}
