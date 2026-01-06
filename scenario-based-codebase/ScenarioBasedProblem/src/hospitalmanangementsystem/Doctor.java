package hospitalmanangementsystem;

public class Doctor {
	private int doctorId;
	private String name;
	private String specialization;

	public Doctor(int doctorId, String name, String specialization) {
		this.doctorId = doctorId;
		this.name = name;
		this.specialization = specialization;
	}

	public String getName() {
		return name;
	}

	public void displayInfo() {
		System.out.println("Doctor: " + name + ", Specialization: " + specialization);
	}
}