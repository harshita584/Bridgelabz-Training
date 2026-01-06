package vehiclerentingsystem;

import java.util.Scanner;

public class VehicalRental {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Take customer name dynamically
        System.out.print("Enter Customer Name: ");
        String customerName = sc.nextLine();

        Customer customer = new Customer(1, customerName);

        // Available vehicles
        Vehicle bike = new Bike("B101", "Yamaha", 300);
        Vehicle car = new Car("C201", "Honda", 1500, 1000);
        Vehicle truck = new Truck("T301", "Tata", 2500, 2000);

        int choice;

        do {
            System.out.println("\n===== Vehicle Rental Menu =====");
            System.out.println("1. Rent Bike");
            System.out.println("2. Rent Car");
            System.out.println("3. Rent Truck");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter number of days: ");
                    int bikeDays = sc.nextInt();
                    customer.rentVehicle(bike, bikeDays);
                    break;

                case 2:
                    System.out.print("Enter number of days: ");
                    int carDays = sc.nextInt();
                    customer.rentVehicle(car, carDays);
                    break;

                case 3:
                    System.out.print("Enter number of days: ");
                    int truckDays = sc.nextInt();
                    customer.rentVehicle(truck, truckDays);
                    break;

                case 4:
                    System.out.println("Thank you for using Vehicle Rental System 🚗");
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

        sc.close();
    }
}
