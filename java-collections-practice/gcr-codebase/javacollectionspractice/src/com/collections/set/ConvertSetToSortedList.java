package com.collections.set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Set;

public class ConvertSetToSortedList {
	public static void main(String[] args) {
		Set<Integer> set = Set.of(5,1,2,4,3);
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		ArrayList<Integer> list = new ArrayList<>(set);
		
		Collections.sort(list);
		System.out.println(list);
	}
}
