package com.objectmodeling.ecommerceplatform;

public class ECommerceDemo {
    public static void main(String[] args) {

        // Create products
        Product p1 = new Product("Laptop", 60000);
        Product p2 = new Product("Headphones", 2000);
        Product p3 = new Product("Mouse", 800);

        // Create customer
        Customer customer = new Customer("Riya");

        // Create order
        Order order1 = new Order(101);

        // Add products to order
        order1.addProduct(p1);
        order1.addProduct(p2);
        order1.addProduct(p3);

        // Customer places order
        customer.placeOrder(order1);

        // View order details
        customer.viewOrders();
    }
}

