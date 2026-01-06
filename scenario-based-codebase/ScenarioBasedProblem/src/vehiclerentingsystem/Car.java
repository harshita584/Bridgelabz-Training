package vehiclerentingsystem;

public class Car extends Vehicle {
    private double insuranceCharge;

    public Car(String id, String brand, double baseRate, double insuranceCharge) {
        super(id, brand, baseRate);
        this.insuranceCharge = insuranceCharge;
    }

    @Override
    public double calculateRent(int days) {
        return (baseRate * days) + insuranceCharge;
    }

    @Override
    public void displayInfo() {
        System.out.println("Car: " + brand + ", Rate/day: " + baseRate);
    }
}