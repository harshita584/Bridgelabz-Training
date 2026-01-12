package com.foodloop;

import java.util.ArrayList;
import java.util.List;

class Order implements IOrderable {
    private List<FoodItem> items = new ArrayList<>();
    private double total;

    public Order(FoodItem... foodItems) {
        for (FoodItem item : foodItems) {
            if (item.isAvailable()) {
                items.add(item);
                item.reduceStock();
            }
        }
        calculateTotal();
    }

    private void calculateTotal() {
        total = 0;

        // Step 1: Calculate base total
        for (FoodItem item : items) {
            total += item.getPrice();
        }

        // Step 2: Decide discount ONCE
        double discount = 0;

        for (FoodItem item : items) {
            discount = item.applyDiscount(total);
            if (discount > 0) {
                break; // apply only one valid discount
            }
        }

        // Step 3: Apply discount
        total -= discount;
    }


    @Override
    public void placeOrder() {
        System.out.println("----------- FOODLOOP ORDER -----------");
        System.out.println("Items Ordered:");

        for (FoodItem item : items) {
            System.out.println("- " + item.getName() + " : ₹" + item.getPrice());
        }

        System.out.println("------------------------------------");
        System.out.println("Total Amount Payable After Discount: ₹" + total);
        System.out.println("Order Status : ORDER CONFIRMED");
        System.out.println("------------------------------------");
    }

    @Override
    public void cancelOrder() {
        System.out.println("Order Status : CANCELLED ❌");
    }
}
