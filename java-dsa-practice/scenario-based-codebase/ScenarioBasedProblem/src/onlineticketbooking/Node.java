package com.onlineticketbooking;

import java.time.LocalTime;

public class Node {
	String name;
	LocalTime startTime;
	Node left;
	Node right;
	int height = 1;
	
	public Node(String name, LocalTime startTime) {
		this.name = name;
		this.startTime = startTime;
	}
	
	public String toString() {
		return name + " " + startTime.toString();
	}
}
