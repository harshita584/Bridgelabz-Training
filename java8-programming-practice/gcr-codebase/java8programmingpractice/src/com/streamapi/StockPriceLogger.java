package com.streamapi;

import java.util.List;

public class StockPriceLogger {
    public static void main(String[] args) {
        List<Double> prices = List.of(102.5, 98.3, 110.0, 105.7);

        prices.forEach(System.out::println);
    }
}
