package com.hashmapsandhashfunctions;

import java.util.HashSet;
import java.util.Set;

public class PairWithGivenSum {

    public static boolean hasPair(int[] arr, int target) {

        Set<Integer> seen = new HashSet<>();

        for (int num : arr) {
            int required = target - num;

            if (seen.contains(required)) {
                System.out.println("Pair found: " + num + " + " + required + " = " + target);
                return true;
            }

            seen.add(num);
        }

        return false;
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {8, 7, 2, 5, 3, 1};
        int target = 10;

        if (!hasPair(arr, target)) {
            System.out.println("No pair found with given sum");
        }
    }
}

