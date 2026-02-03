package com.functionalinterfaces;

import java.util.List;
import java.util.function.Predicate;

public class TemperatureAlertSystem {
	public static void main(String[] args) {
		double threshold = 25.0;
		List<Double> temperature = List.of(10.0,20.0,30.0,40.0,50.0);
		Predicate<Double> predicate = d -> d >= threshold;
		
		temperature.stream().filter(predicate).forEach(t -> System.out.println("Alert current temperature " + t));
	}
}
