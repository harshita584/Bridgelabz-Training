package com.collections.map;

import java.util.*;

public class InvertMap {
	public static void main(String[] args) {
		HashMap<String, Integer> mp = new HashMap<>();
		mp.put("A", 1);
		mp.put("B", 2);
		mp.put("C", 1);
		
		HashMap<Integer, List<String>> result = new HashMap<Integer, List<String>>();
		
		for(String key : mp.keySet()) {
			if(!result.containsKey(mp.get(key))) result.put(mp.get(key), new ArrayList<>());
			result.get(mp.get(key)).add(key);
		}
		System.out.println(result);
	}
}
