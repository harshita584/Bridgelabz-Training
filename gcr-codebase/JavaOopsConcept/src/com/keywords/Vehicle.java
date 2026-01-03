package com.keywords;

public class Vehicle {

    // common registration fee for all vehicles
    static double registrationFee = 100.0;

    // instance variables
    final String registrationNumber;   // cannot be changed
    String ownerName;
    String vehicleType;

    // constructor
    public Vehicle(String ownerName, String vehicleType, String registrationNumber) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
        this.registrationNumber = registrationNumber;
    }

    // update registration fee
    public static void updateRegistrationFee(double newFee) {
        if (newFee >= 0) {
            registrationFee = newFee;
        } else {
            System.out.println("Invalid registration fee");
        }
    }

    // display details
    public void displayRegistrationDetails() {

        // checking object using instanceof
        if (this instanceof Vehicle) {
            System.out.println("Owner Name : " + ownerName);
            System.out.println("Vehicle Type : " + vehicleType);
            System.out.println("Registration Number : " + registrationNumber);
            System.out.println("Registration Fee : " + registrationFee);
        }
    }

    // getters
    public String getOwnerName() {
        return ownerName;
    }

    public String getVehicleType() {
        return vehicleType;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public static void main(String[] args) {

        // update fee
        Vehicle.updateRegistrationFee(150);

        // create objects
        Vehicle v1 = new Vehicle("Harshita Patel", "Sedan", "ABC123");
        Vehicle v2 = new Vehicle("Rahul Tomar", "SUV", "XYZ789");

        // display details
        v1.displayRegistrationDetails();
        System.out.println();
        v2.displayRegistrationDetails();
    }
}
