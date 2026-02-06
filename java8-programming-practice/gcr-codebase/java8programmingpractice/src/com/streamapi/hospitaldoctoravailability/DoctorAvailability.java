package com.streamapi.hospitaldoctoravailability;

import java.util.List;

public class DoctorAvailability {
    public static void main(String[] args) {
        List<Doctor> doctors = List.of(
                new Doctor("A", "specialtyA", true),
                new Doctor("B", "specialtyA", false),
                new Doctor("C", "specialtyB", true),
                new Doctor("D", "specialtyC", true)
        );

        doctors.stream()
                .filter(d -> d.weekendAvailable)
                .sorted((a, b) -> a.specialty.compareTo(b.specialty))
                .forEach(d -> System.out.println(d.name));
    }
}

