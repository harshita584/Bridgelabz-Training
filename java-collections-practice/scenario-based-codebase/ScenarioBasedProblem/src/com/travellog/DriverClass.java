package com.travellog;

import java.io.*;
import java.util.*;
import java.util.regex.*;

public class DriverClass {
    public static void main(String[] args) {

        ArrayList<Trip> trips = new ArrayList<>();
        trips.add(new Trip("City 1", "Country 1", 7, "Decription 1"));
        trips.add(new Trip("City 2", "Country 1", 4, "Decription 2"));
        trips.add(new Trip("City 3", "Country 2", 3, "Decription 3"));
        trips.add(new Trip("City 4", "Country 3", 6, "Decription 4"));
        trips.add(new Trip("City 5", "Country 3", 8, "Decription 5"));

        try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("trips.dat"))) {
            oos.writeObject(trips);
        } 
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        ArrayList<Trip> list = new ArrayList<>();
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("trips.dat"))) {
            list = (ArrayList<Trip>) ois.readObject();
        } 
        catch(IOException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("All Cities Visited (Regex):");
        Pattern cityPattern = Pattern.compile("\\b[A-Z][a-z]+\\b");

        for(Trip t : list) {
            Matcher m = cityPattern.matcher(t.getCity());
            if(m.find()) {
                System.out.println(m.group());
            }
        }

        System.out.println("\rips longer than 5 days:");
        for(Trip t : list) {
            if(t.getDurationDays() > 5) {
                System.out.println(t);
            }
        }

        System.out.println("Unique Countries Visited:");
        Set<String> countries = new HashSet<>();
        for(Trip t : list) {
            countries.add(t.getCountry());
        }
        for(String c : countries) {
            System.out.println(c);
        }

        System.out.println("Top 3 Most Visited Cities:");
        Map<String, Integer> cityCount = new HashMap<>();

        for(Trip t : list) {
            cityCount.put(t.getCity(),
                    cityCount.getOrDefault(t.getCity(), 0) + 1);
        }

        List<Map.Entry<String, Integer>> cityList = new ArrayList<>(cityCount.entrySet());

        cityList.sort((a, b) -> b.getValue() - a.getValue());

        for(int i = 0; i < Math.min(3, cityList.size()); i++) {
            System.out.println(cityList.get(i).getKey() + " " + cityList.get(i).getValue());
        }
    }
}
