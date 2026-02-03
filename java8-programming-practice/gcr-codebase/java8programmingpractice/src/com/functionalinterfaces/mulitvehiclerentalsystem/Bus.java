package com.functionalinterfaces.mulitvehiclerentalsystem;

public class Bus implements Vehicle{
	public void rent() {
		System.out.println("Rent bus");
	}

	public void returnVehicle() {
		System.out.println("Return bus");
	}
}
