package tourmate;

public class Hotel implements IBookable {
    private String name;
    private double costPerNight;
    private int nights;

    public Hotel(String name, double costPerNight, int nights) {
        this.name = name;
        this.costPerNight = costPerNight;
        this.nights = nights;
    }

    public double getCost() {
        return costPerNight * nights;
    }

    public void book() {
        System.out.println("Hotel booked: " + name);
    }
    
    public void cancel() {
        System.out.println("Hotel booking cancelled");
    }
}
