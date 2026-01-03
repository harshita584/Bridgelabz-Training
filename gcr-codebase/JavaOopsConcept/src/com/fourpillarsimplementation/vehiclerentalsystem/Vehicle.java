package com.fourpillarsimplementation.vehiclerentalsystem;

abstract class Vehicle {
  private String vehicleNumber;
  private String type;
  protected double rentalRate;
   
   // Constructor
   public Vehicle(String vehicleNumber, String type, double rentalRate) {
       this.vehicleNumber = vehicleNumber;
       this.type = type;
       this.rentalRate = rentalRate;
   }
   
   // Getters (no direct access to fields)
   public String getVehicleNumber() {
       return vehicleNumber;
   }

   public String getType() {
       return type;
   }
   
   // Abstract method
   abstract double calculateRentalCost(int days);
	
   
}
