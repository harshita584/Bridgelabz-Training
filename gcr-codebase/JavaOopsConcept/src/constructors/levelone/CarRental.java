package constructors.levelone;

public class CarRental {

    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;

    // Default constructor
    CarRental() {
        this.customerName = "Customer";
        this.carModel = "Hatchback";
        this.rentalDays = 1;
        calculateTotalCost();
    }

    // Parameterized constructor
    CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        calculateTotalCost();
    }

    // Method to calculate total cost
    void calculateTotalCost() {
        double costPerDay;

        switch (carModel) {
            case "Sedan":
                costPerDay = 1500;
                break;
            case "SUV":
                costPerDay = 2000;
                break;
            default:
                costPerDay = 1000; // Hatchback
        }

        totalCost = rentalDays * costPerDay;
    }

    public static void main(String[] args) {

        // Using default constructor
        CarRental r1 = new CarRental();
        System.out.println("Rental 1: " + r1.customerName + ", " +
                           r1.carModel + ", Days: " + r1.rentalDays +
                           ", Cost: ₹" + r1.totalCost);

        // Using parameterized constructor
        CarRental r2 = new CarRental("Rohit", "SUV", 4);
        System.out.println("Rental 2: " + r2.customerName + ", " +
                           r2.carModel + ", Days: " + r2.rentalDays +
                           ", Cost: ₹" + r2.totalCost);
    }
}
