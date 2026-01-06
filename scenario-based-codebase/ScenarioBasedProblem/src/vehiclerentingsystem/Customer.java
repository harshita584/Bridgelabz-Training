package vehiclerentingsystem;

public class Customer {
    private int customerId;
    private String name;

    public Customer(int customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public void rentVehicle(Vehicle vehicle, int days) {
        vehicle.displayInfo();
        double rent = vehicle.calculateRent(days);
        System.out.println(name + " rented for " + days +
                " days. Total Rent: " + rent);
    }
}
