package com.workshop.smartcitytransportandservicemanagementsystem;

public interface TransportService {
    String getName();
    double getFare();
    int getPassengers();

    default void printServiceDetails() {
        System.out.println(getName() + " " + getFare());
    }
}