package com.fourpillarsimplementation.ridehailingapplication;

public interface GPS {
    String getCurrentLocation();
    void updateLocation(String newLocation);
}
