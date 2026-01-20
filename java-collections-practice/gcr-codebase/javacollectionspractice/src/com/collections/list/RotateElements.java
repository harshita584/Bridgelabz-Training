package com.collections.list;

import java.util.ArrayList;

public class RotateElements {
	private static void reverse(int st, int end, ArrayList<Integer> list) {
		while(st < end) {
			int temp = list.get(st);
			list.set(st, list.get(end));
			list.set(end, temp);
			st++; end--;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(0);
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		
		int n = list.size();
		int k = 2;
		System.out.println(list);
		reverse(0, k-1, list);
		reverse(k, n-1, list);
		reverse(0, n-1, list);
		
		System.out.println(list);
	}
}
