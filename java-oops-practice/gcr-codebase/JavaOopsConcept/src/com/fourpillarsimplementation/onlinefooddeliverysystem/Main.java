package com.fourpillarsimplementation.onlinefooddeliverysystem;

import java.util.ArrayList;
import java.util.List;

public class Main {
	  // Polymorphic method
    public static void printFinalPrices(List<FoodItem> foodItems) {

        for (FoodItem f : foodItems) {
        	
            if (f instanceof Discountable) {
            	Discountable d = (Discountable) f;
                System.out.println(d.applyDiscount());
                d.getDiscountDetails();
            }
        }
    }

    public static void main(String[] args) {

        List<FoodItem> foodItems = new ArrayList<>();

        foodItems.add(new VegItem("Kadhai Paneer and Naan", 400, 1));
        foodItems.add(new NonVegItem("Biryani", 800, 2));

        printFinalPrices(foodItems);
    }
}
