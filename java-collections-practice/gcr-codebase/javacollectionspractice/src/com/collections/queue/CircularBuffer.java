package com.collections.queue;

public class CircularBuffer {
	static int n = 3;
	static int[] arr = new int[n];
	static int start = 0;
	static int end = 0;
	
	private static void addInbuffer(int ele) {
		if(end <= arr.length-1) arr[end++] = ele;
		else {
			arr[start++] = ele;
			start %= n;
		}
	}
	
	private static void printBuffer() {		
		for(int j = start; j < n && j < end; j++) System.out.print(arr[j] + " ");
		for(int j = 0; j < start; j++) System.out.print(arr[j] + " ");
		System.out.println();
	}
	public static void main(String[] args) {
		addInbuffer(1);
		addInbuffer(2);
		printBuffer();
		addInbuffer(3);
		printBuffer();
		addInbuffer(4);
		addInbuffer(5);
		printBuffer();
	}
}
