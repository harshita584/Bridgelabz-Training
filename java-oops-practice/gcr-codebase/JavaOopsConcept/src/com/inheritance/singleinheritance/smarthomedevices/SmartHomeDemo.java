package com.inheritance.singleinheritance.smarthomedevices;

public class SmartHomeDemo {
    public static void main(String[] args) {

        Thermostat t1 = new Thermostat(101, "ON", 24);
        t1.displayStatus();
    }
}
