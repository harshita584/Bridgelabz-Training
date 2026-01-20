package com.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class ReverseQueue {
	private static void reverseQueue(Queue<Integer> q) {
		if(q.size() == 1) return;
		
		int ele = q.remove();
		reverseQueue(q);
		q.add(ele);
	}
	
	public static void main(String[] args) {
		Queue<Integer> q = new ArrayDeque<Integer>();
		q.add(1);
		q.add(2);
		q.add(3);
		q.add(4);
		q.add(5);
		
		System.out.println(q);
		reverseQueue(q);
		System.out.println(q);
	}
}
