package hospitalmanangementsystem;

public class InPatient extends Patient {
	private int numberOfDays;
	private double dailyCharge;

	public InPatient(int id, String name, String history, int days, double dailyCharge) {
		super(id, name, history);
		this.numberOfDays = days;
		this.dailyCharge = dailyCharge;
	}

	public double getCost() {
		return numberOfDays * dailyCharge;
	}

	@Override
	public void displayInfo() {
		System.out.println("In-Patient: " + name + ", Stay: " + numberOfDays + " days");
	}
}