package com.generics.resumescreeningsystem;

public class DriverClass {
	public static void main(String[] args) {
		Resume<SoftwareEngineer> resume1 = new Resume<>("Applicant1", new SoftwareEngineer());
		System.out.println(resume1);
		
		Resume<DataScientist> resume2 = new Resume<>("Applicant2", new DataScientist());
		System.out.println(resume2);
		
		Resume<DataScientist> resume3 = new Resume<>("Applicant3", new DataScientist());
		System.out.println(resume3);
	}
}
