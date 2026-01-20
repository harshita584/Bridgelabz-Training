package com.collections.map;

import java.util.HashMap;

public class MergeMap {
	public static void main(String[] args) {
		HashMap<String, Integer> mp1 = new HashMap<String, Integer>();
		HashMap<String, Integer> mp2 = new HashMap<String, Integer>();
		
		mp1.put("A", 10);
		mp1.put("B", 20);
		
		mp2.put("C", 10);
		mp2.put("B", 10);
		
		HashMap<String, Integer> result = new HashMap<String, Integer>();
		
		for(String key : mp1.keySet()) result.put(key, mp1.get(key));
		for(String key : mp2.keySet()) result.put(key, result.getOrDefault(key, 0) + mp2.get(key));
		
		System.out.println(result);
	}
}
