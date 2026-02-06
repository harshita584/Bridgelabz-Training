package com.streamapi.insuranceclaimanalysis;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ClaimAnalysis {
    public static void main(String[] args) {
        List<Claim> claims = List.of(
                new Claim("Type1", 5000),
                new Claim("Type1", 7000),
                new Claim("Type3", 12000),
                new Claim("Type3", 8000),
                new Claim("Type2", 20000)
        );

        Map<String, Double> result =
                claims.stream()
                        .collect(Collectors.groupingBy(
                                c -> c.type,
                                Collectors.averagingDouble(c -> c.amount)
                        ));

        result.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
