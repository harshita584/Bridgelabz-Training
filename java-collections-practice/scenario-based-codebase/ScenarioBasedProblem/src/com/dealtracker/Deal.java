package com.dealtracker;

import java.time.LocalDate;

public class Deal<T>{
	String dealCode;
	LocalDate validTill;
	double discount;
	int minimumPuuchase;
	T type;
	
	public Deal(String dealCode, LocalDate validTill, double discount, int minimumPuuchase, T type) {
		this.dealCode = dealCode;
		this.validTill = validTill;
		this.discount = discount;
		this.minimumPuuchase = minimumPuuchase;
		this.type = type;
	}
	
	public String toString() {
		return dealCode + " " + validTill + " " + discount + " " + minimumPuuchase + " " + type; 
	}
}
