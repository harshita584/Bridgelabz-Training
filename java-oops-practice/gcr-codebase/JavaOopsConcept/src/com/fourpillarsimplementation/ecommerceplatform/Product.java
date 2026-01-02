package com.fourpillarsimplementation.ecommerceplatform;

abstract class Product {

    private int productId;
    private String name;
    private double price;

    Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        setPrice(price);   // validation through setter
    }

    // abstract method
    abstract double calculateDiscount();

    // getters
    public int getProductId() {
        return productId;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // setters (controlled updates)
    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    // concrete method
    public void displayDetails() {
        System.out.println("Product ID : " + productId);
        System.out.println("Name       : " + name);
        System.out.println("Price      : " + price);
    }
}

