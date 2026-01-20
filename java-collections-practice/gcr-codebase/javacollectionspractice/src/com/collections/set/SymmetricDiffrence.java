package com.collections.set;

import java.util.ArrayList;
import java.util.Set;

public class SymmetricDiffrence {
	private static ArrayList<Integer> getSymmetricDifference(Set<Integer> set1, Set<Integer> set2){
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		for(int i : set1) {
			if(!set2.contains(i)) result.add(i);
		}
		
		for(int i : set2) {
			if(!set1.contains(i)) result.add(i);
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Set<Integer> set1 = Set.of(1,2,3);
		Set<Integer> set2 = Set.of(5,4,3);
		
		System.out.println(getSymmetricDifference(set1, set2));
	}
}
