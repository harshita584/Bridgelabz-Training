package com.linearandbinarysearch;

public class Search2DMatrixBinary {

    // method to search target in 2D matrix
    static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int left = 0;
        int right = rows * cols - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            // convert mid to 2D indices
            int row = mid / cols;
            int col = mid % cols;

            if (matrix[row][col] == target) {
                return true; // target found
            } else if (matrix[row][col] < target) {
                left = mid + 1; // search right half
            } else {
                right = mid - 1; // search left half
            }
        }

        return false; // target not found
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1, 3, 5, 7},
            {10, 11, 16, 20},
            {23, 30, 34, 50}
        };

        int target = 16;

        boolean found = searchMatrix(matrix, target);

        if (found) {
            System.out.println("Target " + target + " found in the matrix.");
        } else {
            System.out.println("Target " + target + " not found in the matrix.");
        }
    }
}
