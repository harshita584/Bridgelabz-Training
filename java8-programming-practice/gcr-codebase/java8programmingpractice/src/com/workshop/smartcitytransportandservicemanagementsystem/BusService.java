package com.workshop.smartcitytransportandservicemanagementsystem;

public class BusService implements TransportService {
    public String getName() { 
    	return "Bus";
    }
    public double getFare() {
    	return 20;
    }
    public int getPassengers() {
    	return 40; 
    }
}