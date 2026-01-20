package com.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;

public class GenerateBinaryNumbers {
	public static ArrayList<String> generateBinaryNumbers(int n){
		ArrayList<String> result = new ArrayList<String>();
		Queue<String> q = new ArrayDeque<String>();
		
		q.add("1");
		
		while(n-- > 0) {
			String s = q.remove();
			result.add(s);
			q.add(s + "0");
			q.add(s + "1");
		}
		return result;
	}
	
	public static void main(String[] args) {
		ArrayList<String> result = generateBinaryNumbers(10);
		System.out.println(result);
	}
}
