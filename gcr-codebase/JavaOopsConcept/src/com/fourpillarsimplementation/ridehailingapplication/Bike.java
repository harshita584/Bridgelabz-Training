package com.fourpillarsimplementation.ridehailingapplication;

public class Bike extends Vehicle implements GPS {

    private String location;

    public Bike(int id, String driverName) {
        super(id, driverName, 8); // Rs.8 per km
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
