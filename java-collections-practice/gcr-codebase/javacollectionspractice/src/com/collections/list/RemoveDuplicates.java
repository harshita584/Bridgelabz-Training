package com.collections.list;

import java.util.*;

public class RemoveDuplicates {
	public static void main(String[] args) {
		List<Integer> list = List.of(0, 0, 1, 2, 3, 1, 2, 1, 4, 4);
		HashSet<Integer> set = new HashSet<Integer>();
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		System.out.println(list);
		for(int i : list) {
			if(!set.contains(i)) {
				set.add(i);
				result.add(i);
			}
		}
		System.out.println(result);
	}
}
