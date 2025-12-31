package com.objectmodeling.ecommerceplatform;

public class Product {
    String productName;
    double price;

    public Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }

    public void displayProduct() {
        System.out.println(productName + " - ₹" + price);
    }
}
