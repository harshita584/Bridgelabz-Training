package com.streamapi;

import java.util.List;

public class TransformNames {
    public static void main(String[] args) {
        List<String> names = List.of("Name1", "Name2", "Name3", "Name4");

        names.stream()
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);
    }
}
