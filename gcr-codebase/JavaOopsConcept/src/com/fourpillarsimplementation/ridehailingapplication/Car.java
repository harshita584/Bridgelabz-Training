package com.fourpillarsimplementation.ridehailingapplication;

public class Car extends Vehicle implements GPS {

    private String location;

    public Car(int id, String driverName) {
        super(id, driverName, 15); // Rs.15 per km
    }

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public String getCurrentLocation() {
        return location;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.location = newLocation;
    }
}

