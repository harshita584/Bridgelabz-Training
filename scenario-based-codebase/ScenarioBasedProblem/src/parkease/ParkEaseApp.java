package com.parkease;

public class ParkEaseApp {
    public static void main(String[] args) {

        ParkingSlot slot1 = new ParkingSlot(101, "Basement-A", "Car");
        Vehicle car = new Car("MP04AB1234");

        if (slot1.isAvailable()) {
            slot1.assignSlot();
            double charges = car.calculateCharges(6);

            System.out.println(slot1.getSlotDetails());
            System.out.println("Parking Charges: Rs." + charges);
        }
    }
}

