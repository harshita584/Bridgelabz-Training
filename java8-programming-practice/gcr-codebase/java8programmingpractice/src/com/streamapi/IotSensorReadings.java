package com.streamapi;

import java.util.List;

public class IotSensorReadings {
    public static void main(String[] args) {
        List<Integer> readings = List.of(20, 55, 30, 80, 45);

        readings.stream()
                .filter(r -> r > 50)
                .forEach(System.out::println);
    }
}
