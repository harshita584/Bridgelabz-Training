package com.tailorshop;

import java.time.LocalTime;

public class Order {
	int no;
	LocalTime time;
	
	public Order(int no, LocalTime time) {
		this.no = no;
		this.time = time;
	}
	
	public String toString() {
		return no + " " + time;
	}
}
