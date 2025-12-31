package com.inheritance.singleinheritance.smarthomedevices;

class Device {
    int deviceId;
    String status;

    Device(int deviceId, String status) {
        this.deviceId = deviceId;
        this.status = status;
    }

    void displayStatus() {
        System.out.println("Device ID: " + deviceId);
        System.out.println("Status: " + status);
    }
}
