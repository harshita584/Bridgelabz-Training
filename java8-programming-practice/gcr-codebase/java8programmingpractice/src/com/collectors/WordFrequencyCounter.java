package com.collectors;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class WordFrequencyCounter {
    public static void main(String[] args) {
        String text = "java streams java streams java";
        String[] words = text.split(" ");

        Map<String, Long> result =
                Arrays.stream(words)
                        .collect(Collectors.groupingBy(
                                w -> w,
                                Collectors.counting()
                        ));

        result.forEach((k, v) -> System.out.println(k + " " + v));
    }
}
