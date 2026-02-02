package com.dealtracker;

import java.io.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class DriverClass {
    public static void main(String[] args) {

        File folder = new File("input");
        Map<String, Deal<String>> validDeals = new HashMap<>();
        Set<String> uniqueDealCodes = new HashSet<>();
        ArrayList<Deal<String>> deals = new ArrayList<>();

        if (!folder.exists() || !folder.isDirectory()) {
            System.out.println("Input folder not found");
            return;
        }

        for (File file : folder.listFiles()) {
            if (!file.getName().endsWith(".txt")) continue;

            try (BufferedReader reader = new BufferedReader(new FileReader(file))) {

                String dealCodeP = "^DealCode:\\s[A-Z0-9]+$";
                String validTillP = "^ValidTill:\\s\\d{2}-\\d{2}-\\d{4}$";
                String discountP = "^Discount:\\s\\d+%$";
                String minimumPurchaseP = "^MinimumPurchase:\\s\\d+$";

                String dealCodeString = reader.readLine();
                String validTillString = reader.readLine();
                String discountString = reader.readLine();
                String minimumPurchaseString = reader.readLine();

                if (dealCodeString == null || validTillString == null
                        || discountString == null || minimumPurchaseString == null) {
                    continue;
                }

                if (!dealCodeString.matches(dealCodeP)
                        || !validTillString.matches(validTillP)
                        || !discountString.matches(discountP)
                        || !minimumPurchaseString.matches(minimumPurchaseP)) {
                    continue;
                }

                String dealCode = dealCodeString.substring(10);
                String dateString = validTillString.substring(11);
                int discount = Integer.parseInt(
                        discountString.substring(10, discountString.length() - 1)
                );
                int minimumPurchase = Integer.parseInt(minimumPurchaseString.substring(17));

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                LocalDate expDate = LocalDate.parse(dateString, formatter);

                Deal<String> deal = new Deal<>(dealCode, expDate, discount, minimumPurchase, "Cashback");

                uniqueDealCodes.add(dealCode);
                deals.add(deal);

                if (LocalDate.now().isBefore(expDate) || LocalDate.now().isEqual(expDate)) {
                    validDeals.put(dealCode, deal);
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println(deals);
        System.out.println(uniqueDealCodes);
        System.out.println(validDeals);
    }
}
