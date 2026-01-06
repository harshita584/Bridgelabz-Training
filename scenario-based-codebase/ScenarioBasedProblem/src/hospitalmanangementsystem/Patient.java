package hospitalmanangementsystem;

public abstract class Patient {
	protected int patientId;
	protected String name;
	private String medicalHistory; // sensitive
	protected Doctor assignedDoctor;

	// Normal admission
	public Patient(int patientId, String name) {
		this.patientId = patientId;
		this.name = name;
		this.medicalHistory = "Not Provided";
	}

	// Emergency admission (constructor overloading)
	public Patient(int patientId, String name, String medicalHistory) {
		this.patientId = patientId;
		this.name = name;
		this.medicalHistory = medicalHistory;
	}

	public void assignDoctor(Doctor doctor) {
		this.assignedDoctor = doctor;
	}

	// Encapsulation: expose summary, not raw history
	public String getSummary() {
		return "Patient: " + name + ", Doctor: " + (assignedDoctor != null ? assignedDoctor.getName() : "Not Assigned");
	}

	public abstract void displayInfo(); // polymorphism hook
}