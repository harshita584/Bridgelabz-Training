package com.musicapp;

public class Node {
	int trackId;
	String title;
	
	Node left;
	Node right;
	
	public Node(int trackId, String title) {
		this.trackId = trackId;
		this.title = title;
	}
	
	public String toString() {
		return trackId + " " + title;
	}
}
