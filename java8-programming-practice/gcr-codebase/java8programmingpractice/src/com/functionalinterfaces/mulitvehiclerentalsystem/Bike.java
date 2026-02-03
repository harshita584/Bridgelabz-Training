package com.functionalinterfaces.mulitvehiclerentalsystem;

public class Bike implements Vehicle{
	public void rent() {
		System.out.println("Rent bike");
	}

	public void returnVehicle() {
		System.out.println("Return bike");
	}
}
