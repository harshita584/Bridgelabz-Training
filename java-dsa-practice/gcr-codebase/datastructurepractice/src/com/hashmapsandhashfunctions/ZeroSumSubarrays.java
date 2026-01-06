package com.hashmapsandhashfunctions;

import java.util.*;

public class ZeroSumSubarrays {

    public static void findZeroSumSubarrays(int[] arr) {

        // Map: cumulative sum -> list of indices
        Map<Integer, List<Integer>> map = new HashMap<>();

        int sum = 0;

        // Handle subarrays starting from index 0
        map.put(0, new ArrayList<>(Arrays.asList(-1)));

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (map.containsKey(sum)) {
                for (int startIndex : map.get(sum)) {
                    System.out.println("Subarray found from index "
                            + (startIndex + 1) + " to " + i);
                }
            }

            map.computeIfAbsent(sum, k -> new ArrayList<>()).add(i);
        }
    }

    // Main method
    public static void main(String[] args) {

        int[] arr = {3, 4, -7, 3, 1, 3, 1, -4};

        findZeroSumSubarrays(arr);
    }
}

