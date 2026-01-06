package cabbygo;

import java.util.Scanner;

public class CabbyGoApplicaation {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Driver Details
		System.out.println("Enter Driver Name: ");
		String driverName = input.nextLine();

		System.out.println("Enter License Number: ");
		String licenseNumber = input.nextLine();

		System.out.println("Enter Driver Rating: ");
		double rating = input.nextDouble();
		input.nextLine();

		Driver driver = new Driver(driverName, licenseNumber, rating);

		// Vehicle Selection
		System.out.println("\nChoose Vehicle Type:");
		System.out.println("1. Mini");
		System.out.println("2. Sedan");
		System.out.println("3. SUV");
		int choice = input.nextInt();

		System.out.println("Enter Vehicle Number:");
		int vehicleNumber = input.nextInt();

		Vehicle vehicle;

		switch (choice) {
		case 1:
			vehicle = new Mini(vehicleNumber);
			break;
		case 2:
			vehicle = new Sedan(vehicleNumber);
			break;
		case 3:
			vehicle = new SUV(vehicleNumber);
			break;
		default:
			System.out.println("Invalid choice. Defaulting to Mini.");
			vehicle = new Mini(vehicleNumber);
		}
		
		input.nextLine(); 
		
		//Ride details
		System.out.println("Enter PickUp Location: ");
		String location = input.nextLine();
		
		System.out.println("Enter Distance (in km):");
        double distance = input.nextDouble();
        input.nextLine();
        
        Ride ride = new Ride(vehicle, driver, distance, location);

        System.out.println("\nRide Details ");
        ride.startRide();

        System.out.println("\nPress Enter to end the ride...");
       
        input.nextLine();

        ride.endRide();

        input.close();
	}
}