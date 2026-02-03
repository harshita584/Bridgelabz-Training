package com.lambdaexpression.hopitalpatientidprinting;

import java.util.List;

public class PrintId {
	public static void main(String[] args) {
		List<Patient> patients = List.of(
				new Patient(0, "Patient 1"),
				new Patient(1, "Patient 2"),
				new Patient(3, "Patient 3")
				);
		
		patients.stream().map(Patient::getId).forEach(System.out::println);
	}
}
