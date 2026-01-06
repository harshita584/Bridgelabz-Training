package cabbygo;

public class Driver {
	
	private String name;
	private String licenseNumber;
	private double rating;

	public Driver(String name, String licenseNumber, double rating) {
		this.name = name;
		this.setLicenseNumber(licenseNumber);
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public double getRating() {
		return rating;
	}

	public String getLicenseNumber() {
		return licenseNumber;
	}

	public void setLicenseNumber(String licenseNumber) {
		this.licenseNumber = licenseNumber;
	}

}