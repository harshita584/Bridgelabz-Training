package com.workshop.smartcitytransportandservicemanagementsystem;

import java.util.*;
import java.util.stream.Collectors;

public class SmartCitySystem {
    public static void main(String[] args) {
        List<TransportService> services = List.of(
                new BusService(),
                new MetroService(),
                new TaxiService()
        );

        services.stream()
                .sorted((a, b) -> Double.compare(a.getFare(), b.getFare()))
                .forEach(TransportService::printServiceDetails);

        FareCalculator calculator = d -> d * 5;
        System.out.println(calculator.calculateFare(
                GeoUtils.calculateDistance(10, 25)));

        List<Passenger> passengers = List.of(
                new Passenger("P1", 20, true),
                new Passenger("P1", 30, false),
                new Passenger("P2", 50, true),
                new Passenger("P2", 60, false)
        );

        passengers.stream()
                .collect(Collectors.groupingBy(p -> p.route))
                .forEach((k, v) -> System.out.println(k + " " + v.size()));

        passengers.stream()
                .collect(Collectors.partitioningBy(p -> p.peak))
                .forEach((k, v) -> System.out.println(k + " " + v.size()));

        passengers.stream()
                .collect(Collectors.summarizingDouble(p -> p.fare))
                .getAverage();

        services.stream()
                .filter(s -> s instanceof EmergencyService)
                .forEach(s -> System.out.println("Emergency " + s.getName()));
    }
}