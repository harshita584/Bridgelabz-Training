package com.functionalinterfaces.smartvehicledashboard;

public interface Vehicle {
		default public void displaySpeed() {
			System.out.println("Current speed on vehicle");
		}
		
		default public void showBatteryPercentage() {
			System.out.println("Current battery percentage");
		}
}
