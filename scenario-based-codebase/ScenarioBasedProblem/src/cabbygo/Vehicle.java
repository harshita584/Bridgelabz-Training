package cabbygo;

public abstract class Vehicle implements IRideService{
	private int vehicleNumber ;
	private int capacity;
	private String type;
	
	private double fare; //sensitive
	private double baseFare;
	private double rateperkm;
	
	public Vehicle(int vehicleNumber, int capacity , String type, double baseFare , double rateperkm) {
		this.setVehicleNumber(vehicleNumber);
		this.setCapacity(capacity);
		this.type = type;
		this.baseFare = baseFare;
		this.rateperkm = rateperkm;
		
	}
	
	protected  double calculateFare(double distance) {
		return baseFare + (distance *rateperkm);
	}
	
	public double bookRide(double distance) {
		fare = calculateFare(distance);
		System.out.println("Ride booked for distance: " + distance + "km");
		return fare;
	}
	
	public void endRide() {
		System.out.println("Your ride has ended successfully");
		System.out.println("Total Fare: " + fare);
	}
	
	public String getType() {
        return type;
    }

    public double getFare() {
        return fare;
    }

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public int getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(int vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	
	
}