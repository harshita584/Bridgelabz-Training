package com.objectmodeling.ecommerceplatform;

import java.util.ArrayList;

public class Order {
    int orderId;
    ArrayList<Product> products;

    public Order(int orderId) {
        this.orderId = orderId;
        products = new ArrayList<>();
    }

    // Add product to order
    public void addProduct(Product product) {
        products.add(product);
    }

    // Display order details
    public void showOrderDetails() {
        System.out.println("Order ID: " + orderId);
        double total = 0;

        for (Product p : products) {
            p.displayProduct();
            total += p.price;
        }

        System.out.println("Total Amount: ₹" + total);
        System.out.println();
    }
}
