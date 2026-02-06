package com.collectors.orderrevenuesummary;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RevenueSummary {
    public static void main(String[] args) {
        List<Order> orders = List.of(
                new Order("Name1", 1200),
                new Order("Name1", 800),
                new Order("Name2", 600),
                new Order("Name4", 400)
        );

        Map<String, Double> revenue = orders.stream()
                        .collect(Collectors.groupingBy(
                                o -> o.customer,
                                Collectors.summingDouble(o -> o.amount)
                        ));

        revenue.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
