package com.medwarehouse;

import java.time.LocalDate;

public class Medicine {
	String name;
	LocalDate expiryDate;
	
	public Medicine(String name, LocalDate expiryDate) {
		this.name = name;
		this.expiryDate = expiryDate;
	}
	
	public String toString() {
		return name + " " + expiryDate;
	}
}
