package com.linearandbinarysearch;

import java.util.Arrays;

public class LinearBinaryChallenge {

    // Linear Search: Find first missing positive integer
    static int firstMissingPositive(int[] arr) {
        int n = arr.length;

        // mark numbers out of range
        for (int i = 0; i < n; i++) {
            if (arr[i] <= 0 || arr[i] > n) {
                arr[i] = n + 1;
            }
        }

        // mark visited numbers by negating the value at the index
        for (int i = 0; i < n; i++) {
            int num = Math.abs(arr[i]);
            if (num <= n) {
                arr[num - 1] = -Math.abs(arr[num - 1]);
            }
        }

        // find first positive index
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                return i + 1;
            }
        }

        return n + 1; // all numbers 1..n are present
    }

    // Binary Search: Find target index in sorted array
    static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1; // target not found
    }

    public static void main(String[] args) {

        int[] numbers = {3, 4, -1, 1};
        int target = 3;

        // Linear Search: First missing positive
        int missing = firstMissingPositive(Arrays.copyOf(numbers, numbers.length));
        System.out.println("First missing positive integer: " + missing);

        // Binary Search: Target index
        int[] sorted = Arrays.copyOf(numbers, numbers.length);
        Arrays.sort(sorted);
        int targetIndex = binarySearch(sorted, target);

        if (targetIndex != -1) {
            System.out.println("Target " + target + " found at index (in sorted array): " + targetIndex);
        } else {
            System.out.println("Target " + target + " not found in the array.");
        }
    }
}
