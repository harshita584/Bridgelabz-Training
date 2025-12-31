package com.inheritance.singleinheritance.smarthomedevices;

class Thermostat extends Device {
    int temperatureSetting;

    Thermostat(int deviceId, String status, int temperatureSetting) {
        super(deviceId, status);   // calling parent constructor
        this.temperatureSetting = temperatureSetting;
    }

    void displayStatus() {
        super.displayStatus();   // calling parent method
        System.out.println("Temperature Setting: " + temperatureSetting + "°C");
    }
}
