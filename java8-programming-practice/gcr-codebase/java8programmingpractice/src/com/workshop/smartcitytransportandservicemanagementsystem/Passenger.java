package com.workshop.smartcitytransportandservicemanagementsystem;

public class Passenger {
    String route;
    double fare;
    boolean peak;

    public Passenger(String route, double fare, boolean peak) {
        this.route = route;
        this.fare = fare;
        this.peak = peak;
    }
}