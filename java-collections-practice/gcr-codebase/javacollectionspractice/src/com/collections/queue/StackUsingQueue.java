package com.collections.queue;

import java.util.ArrayDeque;
import java.util.Queue;

public class StackUsingQueue {
	static Queue<Integer> pushQueue;
	static Queue<Integer> popQueue;
	
	private static void push(int ele) {
		pushQueue.add(ele);
	}
	
	private static int pop() {
		while(pushQueue.size() > 1) {
			popQueue.add(pushQueue.remove());
		}
		
		Queue<Integer> temp = pushQueue;
		pushQueue = popQueue;
		popQueue = temp;
		
		return popQueue.remove();
	}
	
	public static void main(String[] args) {
		pushQueue = new ArrayDeque<Integer>();
		popQueue = new ArrayDeque<Integer>();
		
		push(0);
		push(1);
		push(2);
		System.out.println(pop());
		push(3);
		System.out.println(pop());
		System.out.println(pop());
		push(4);
		System.out.println(pop());
	}
}
