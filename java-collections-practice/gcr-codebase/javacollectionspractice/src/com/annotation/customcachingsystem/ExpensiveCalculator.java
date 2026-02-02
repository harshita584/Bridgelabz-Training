package com.annotation.customcachingsystem;

import java.util.HashMap;
import java.util.Map;

public class ExpensiveCalculator {

    // Cache store: input -> result
    private Map<Integer, Integer> cache = new HashMap<>();

    @CacheResult
    public int square(int num) {

        if (cache.containsKey(num)) {
            System.out.println("Returning cached result for " + num);
            return cache.get(num);
        }

        System.out.println("Computing result for " + num);
        int result = num * num;   // Simulating expensive computation
        cache.put(num, result);
        return result;
    }
}
