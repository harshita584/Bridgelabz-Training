package com.linearandbinarysearch;

public class FirstNegativeLinearSearch {

    // method to find first negative number
    static int findFirstNegative(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                return i; // return index of first negative number
            }
        }

        return -1; // no negative number found
    }

    public static void main(String[] args) {

        int[] numbers = {12, 5, 0, 9, -3, -7, 8};

        int index = findFirstNegative(numbers);

        if (index != -1) {
            System.out.println("First negative number found at index: " + index);
            System.out.println("Value: " + numbers[index]);
        } else {
            System.out.println("No negative number found in the array.");
        }
    }
}
