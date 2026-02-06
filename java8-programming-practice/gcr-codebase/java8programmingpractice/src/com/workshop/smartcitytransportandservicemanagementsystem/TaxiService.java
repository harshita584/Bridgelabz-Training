package com.workshop.smartcitytransportandservicemanagementsystem;

public class TaxiService implements TransportService, EmergencyService {
    public String getName() { 
    	return "Taxi"; 
    }
    public double getFare() {
    	return 80; 
    }
    public int getPassengers() {
    	return 2; 
    }
}