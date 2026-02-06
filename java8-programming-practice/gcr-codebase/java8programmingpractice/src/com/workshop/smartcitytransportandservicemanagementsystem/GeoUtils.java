package com.workshop.smartcitytransportandservicemanagementsystem;

public interface GeoUtils {
    static double calculateDistance(double a, double b) {
        return Math.abs(a - b);
    }
}