
package cabbygo;

public class Ride {
	private Vehicle vehicle;	//association
	private Driver driver;		//association
	
	private double distance;	//sensitive
	private String location;	//sensitive
	private double totalFare;	//sensitive
	
	
	//constructor
	public Ride(Vehicle vehicle, Driver driver ,double distance, String location) {
		this.vehicle = vehicle;
		this.driver = driver;
		this.distance = distance;
		this.location = location;
		
	}
	
	public void startRide() {
		System.out.println("Ride Started ");
		System.out.println("Driver Name: " + driver.getName());
		System.out.println("Vehicle type: " + vehicle.getType());
		totalFare = vehicle.bookRide(distance);
	}
	
	public void endRide() {
		vehicle.endRide();
		System.out.println("Pickup Location: " + location);
		System.out.println("Final fare: " + totalFare);
	}
	public double getTotalFare() {
		return totalFare;
	}
}
