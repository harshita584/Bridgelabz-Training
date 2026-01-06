package com.stackandqueue;

import java.util.Stack;

public class StockSpan {

    public static int[] calculateSpan(int[] prices) {

        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); // stores indices

        for (int i = 0; i < n; i++) {

            // Pop while current price is higher
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // Calculate span
            span[i] = stack.isEmpty() ? (i + 1) : (i - stack.peek());

            // Push current index
            stack.push(i);
        }

        return span;
    }

    // Main method
    public static void main(String[] args) {

        int[] prices = {100, 80, 60, 70, 60, 75, 85};

        int[] span = calculateSpan(prices);

        System.out.println("Stock Prices:");
        for (int p : prices) System.out.print(p + " ");

        System.out.println("\nStock Span:");
        for (int s : span) System.out.print(s + " ");
    }
}
