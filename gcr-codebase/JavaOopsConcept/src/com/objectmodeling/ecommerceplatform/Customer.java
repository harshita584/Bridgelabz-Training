package com.objectmodeling.ecommerceplatform;

import java.util.ArrayList;

public class Customer {
    String customerName;
    ArrayList<Order> orders;

    public Customer(String customerName) {
        this.customerName = customerName;
        orders = new ArrayList<>();
    }

    // Customer places an order
    public void placeOrder(Order order) {
        orders.add(order);
        System.out.println(customerName + " placed Order ID: " + order.orderId);
    }

    // View all orders
    public void viewOrders() {
        System.out.println("Customer: " + customerName);
        for (Order o : orders) {
            o.showOrderDetails();
        }
    }
}
