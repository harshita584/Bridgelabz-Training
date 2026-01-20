package com.collections.set;

import java.util.Set;

public class CheckSubset {
	private static boolean isSubset(Set<Integer> set1, Set<Integer> set2) {
		for(int i : set1) {
			if(!set2.contains(i)) return false;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Set<Integer> set1 = Set.of(1,2,3);
		Set<Integer> set2 = Set.of(5,4,1,2,3);
		
		if(isSubset(set1, set2)) System.out.println("Set1 is subset of set2");
		else System.out.println("Set1 is not subset of set2");
	}
}
