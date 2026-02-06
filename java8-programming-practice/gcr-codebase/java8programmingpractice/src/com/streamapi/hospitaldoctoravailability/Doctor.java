package com.streamapi.hospitaldoctoravailability;

public class Doctor {
    String name;
    String specialty;
    boolean weekendAvailable;

    public Doctor(String name, String specialty, boolean weekendAvailable) {
        this.name = name;
        this.specialty = specialty;
        this.weekendAvailable = weekendAvailable;
    }
}
