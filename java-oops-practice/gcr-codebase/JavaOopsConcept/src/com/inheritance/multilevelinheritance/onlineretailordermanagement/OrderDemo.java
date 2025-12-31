package com.inheritance.multilevelinheritance.onlineretailordermanagement;

public class OrderDemo {
    public static void main(String[] args) {

        DeliveredOrder d1 = new DeliveredOrder(
            501,
            "12-08-2025",
            "TRK12345",
            "15-08-2025"
        );

        System.out.println("Order ID: " + d1.orderId);
        System.out.println("Order Date: " + d1.orderDate);
        System.out.println("Tracking Number: " + d1.trackingNumber);
        System.out.println("Delivery Date: " + d1.deliveryDate);
        System.out.println("Status: " + d1.getOrderStatus());
    }
}
