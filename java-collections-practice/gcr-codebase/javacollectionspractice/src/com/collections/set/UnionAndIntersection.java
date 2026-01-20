package com.collections.set;

import java.util.ArrayList;
import java.util.Set;

public class UnionAndIntersection {
	private static ArrayList<Integer> getUnion(Set<Integer> set1, Set<Integer> set2){
		ArrayList<Integer> result = new ArrayList<>(set1);
		
		for(int i : set2) {
			if(!set1.contains(i)) result.add(i);
		}
		return result;
	}
	
	private static ArrayList<Integer> getIntersection(Set<Integer> set1, Set<Integer> set2){
		ArrayList<Integer> result = new ArrayList<>();
		
		for(int i : set2) {
			if(set1.contains(i)) result.add(i);
		}
		return result;
	}
	
	public static void main(String[] args) {
		Set<Integer> set1 = Set.of(1,2,3);
		Set<Integer> set2 = Set.of(5,4,3);
		
		System.out.println(getUnion(set1, set2));
		System.out.println(getIntersection(set1, set2));
	}
}
