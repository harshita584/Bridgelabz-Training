package com.linearandbinarysearch;

public class PeakElementBinarySearch {

    // method to find a peak element index
    static int findPeak(int[] arr) {

        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // check neighbors safely
            boolean leftOK = (mid == 0) || (arr[mid] > arr[mid - 1]);
            boolean rightOK = (mid == n - 1) || (arr[mid] > arr[mid + 1]);

            if (leftOK && rightOK) {
                return mid; // peak found
            } else if (mid > 0 && arr[mid] < arr[mid - 1]) {
                // peak is in left half
                right = mid - 1;
            } else {
                // peak is in right half
                left = mid + 1;
            }
        }

        return -1; // should not reach here
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 20, 4, 1, 0};

        int peakIndex = findPeak(arr);

        if (peakIndex != -1) {
            System.out.println("A peak element is at index: " + peakIndex);
            System.out.println("Value: " + arr[peakIndex]);
        } else {
            System.out.println("No peak element found.");
        }
    }
}
