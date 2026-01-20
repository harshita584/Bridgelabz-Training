package com.collections.queue;

import java.util.PriorityQueue;

public class HospitalTriageSystem {
	public static void main(String[] args) {
		PriorityQueue<Patient> pq = new PriorityQueue<Patient>((a, b) -> b.priority - a.priority);
		
		pq.add(new Patient("John", 5));
		pq.add(new Patient("Rick", 1));
		pq.add(new Patient("Harry", 3));
		pq.add(new Patient("Tom", 2));
		
		while(!pq.isEmpty()) {
			System.out.println(pq.remove());
		}
	}
}
