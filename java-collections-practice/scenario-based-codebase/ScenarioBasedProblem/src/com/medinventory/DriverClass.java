package com.medinventory;

import java.io.*;
import java.util.*;
import java.util.regex.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class DriverClass {

    public static void main(String[] args) {

        File file = new File("inventory.csv");

        if(!file.exists()) {
            System.out.println("Inventory file not found");
            return;
        }

        Map<String, List<Item<String>>> categoryMap = new HashMap<>();
        categoryMap.put("Expired", new ArrayList<>());
        categoryMap.put("Valid", new ArrayList<>());

        Set<Item<String>> uniqueItems = new HashSet<>();

        Pattern datePattern = Pattern.compile("\\d{2}-\\d{2}-\\d{4}");

        try(BufferedReader br = new BufferedReader(new FileReader(file))) {
            String line;
            while((line = br.readLine()) != null) {
                try {
                    String[] parts = line.split(",");

                    if(parts.length != 4) {
                        throw new Exception("Invalid format");
                    }

                    String id = parts[0];
                    String name = parts[1];
                    int quantity = Integer.parseInt(parts[2]);
                    String expiry = parts[3];

                    if(!datePattern.matcher(expiry).matches()) throw new Exception("Invalid date format");

                    Item<String> item = new Item<>(id, name, quantity, expiry, "Medical");
                    if(quantity < 5) throw new LowStockException("Critical low stock for item: " + name);
                    uniqueItems.add(item);

                }
                catch(LowStockException e) {
                    System.out.println(e.getMessage());
                }
                catch(Exception e) {
                    System.out.println("Skipping invalid line: " + line);
                }
            }

        } 
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        LocalDate today = LocalDate.now();

        for(Item<String> item : uniqueItems) {
            LocalDate exp = LocalDate.parse(item.getExpiryDate(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));

            if(exp.isBefore(today)) categoryMap.get("Expired").add(item);
            else categoryMap.get("Valid").add(item);
        }

        System.out.println("Expired items:");
        for(Item<String> i : categoryMap.get("Expired")) {
            System.out.println(i);
        }

        System.out.println("valid items:");
        for(Item<String> i : categoryMap.get("Valid")) {
            System.out.println(i);
        }
    }
}
