package com.collections.list;

import java.util.*;

public class FindFrequency {
	public static HashMap<String, Integer> getFreq(List<String> list){
		HashMap<String, Integer> mp = new HashMap<>();
		
		for(String s : list) {
			mp.put(s, mp.getOrDefault(s, 0)+1);
		}
		return mp;
	}
	public static void main(String[] args) {
		List<String> list = List.of("orange", "apple", "mango", "apple", "apple", "mango");
		System.out.println(getFreq(list));
	}
}
