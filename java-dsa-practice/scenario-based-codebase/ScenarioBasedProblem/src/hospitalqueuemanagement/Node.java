package com.hospitalqueuemanagement;

import java.time.LocalTime;

public class Node {
	String name;
	LocalTime checkInTime;
	int height = 1;
	Node left;
	Node right;
	
	public Node(String name, LocalTime checkInTime) {
		this.name = name;
		this.checkInTime = checkInTime;
	}
	
	public String toString() {
		return name + " " + checkInTime.toString();
	}
}
