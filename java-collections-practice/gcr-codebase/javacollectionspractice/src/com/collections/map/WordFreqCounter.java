package com.collections.map;

import java.util.HashMap;

public class WordFreqCounter {
	public static void main(String[] args) {
		String str = "Hello world, hello java!";
		str  = str.toLowerCase();
		String[] words = str.split("[^a-zA-z]+");
		
		HashMap<String, Integer> mp = new HashMap<>();
		
		for(String word : words) mp.put(word, mp.getOrDefault(word, 0)+1);
		System.out.println(mp);
	}
}
