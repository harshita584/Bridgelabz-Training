package com.fourpillarsimplementation.ridehailingapplication;

public class Main {

    public static void main(String[] args) {

        Vehicle v1 = new Car(101, "Ramesh");
        Vehicle v2 = new Bike(102, "Suresh");
        Vehicle v3 = new Auto(103, "Mahesh");

        Vehicle[] rides = {v1, v2, v3};

        double distance = 12.5;

        for (Vehicle v : rides) {
            v.getVehicleDetails();
            System.out.println("Fare for " + distance + " km: Rs." + v.calculateFare(distance));
            System.out.println("-------------------------");
        }
    }
}
