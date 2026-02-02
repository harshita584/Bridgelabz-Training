package com.gamingapp;

public class Node {
	String name;
	int points;
	Node left;
	Node right;
	int height;
	
	public Node(String name, int points) {
		this.name = name;
		this.points = points;
		this.height = 1;
	}
	
	public String toString() {
		return name + " " + points;
	}
}
