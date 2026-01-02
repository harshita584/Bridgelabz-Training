package com.fourpillarsimplementation.vehiclerentalsystem;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car("CAR101", 1500, "CAR98765"));
        vehicles.add(new Bike("BIKE202", 500, "BIK54321"));
        vehicles.add(new Truck("TRK303", 3000, "TRK11223"));

        int days = 3;

        for (Vehicle v : vehicles) {
            System.out.println("Vehicle Type: " + v.getType());
            System.out.println("Vehicle Number: " + v.getVehicleNumber());
            System.out.println("Rental Cost: Rs." + v.calculateRentalCost(days));

            if (v instanceof Insurable) {
                Insurable ins = (Insurable) v;
                System.out.println("Insurance Cost: Rs." + ins.calculateInsurance(days));
                System.out.println(ins.getInsuranceDetails());
            }
            

            System.out.println("----------------------------------");
        }
    }
}
