package com.streams;

import java.io.*;
import java.util.HashMap;
import java.util.PriorityQueue;

public class CountWords {
	public static void main(String[] args) {
		HashMap<String, Integer> mp = new HashMap<String, Integer>();
		PriorityQueue<String> pq = new PriorityQueue<String>((a, b) -> mp.get(a) - mp.get(b));
		
		try(BufferedReader reader = new BufferedReader(new FileReader("name.txt"))){
			String line;
			
			while((line = reader.readLine()) != null) {
				String[] words = line.split(" ");
				for(String word : words) {
					mp.put(word, mp.getOrDefault(word, 0)+1);
				}
			}
						
			for(String s : mp.keySet()) {
				pq.add(s);
				if(pq.size() > 5) pq.remove();
			}
			
			while(!pq.isEmpty()) {
				String word = pq.remove();
				System.out.println(word + " " + mp.get(word));
			}
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
	}
}
