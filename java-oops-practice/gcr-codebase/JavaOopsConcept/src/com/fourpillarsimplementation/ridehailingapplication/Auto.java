package com.fourpillarsimplementation.ridehailingapplication;

public class Auto extends Vehicle implements GPS {

    private String location;

    public Auto(int id, String driverName) {
        super(id, driverName, 10); // Rs.10 per km
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

