package hospitalmanangementsystem;

public class OutPatient extends Patient {
	private double consultationFee;

	public OutPatient(int id, String name, double consultationFee) {
		super(id, name);
		this.consultationFee = consultationFee;
	}

	public double getCost() {
		return consultationFee;
	}

	@Override
	public void displayInfo() {
		System.out.println("Out-Patient: " + name + ", Consultation Fee: ₹" + consultationFee);
	}
}