package com.foodloop;

abstract class FoodItem {
    private String name;
    private String category;
    private double price;
    private int stock;   // hidden stock level (encapsulation)

    public FoodItem(String name, String category, double price, int stock) {
        this.name = name;
        this.category = category;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public boolean isAvailable() {
        return stock > 0;
    }

    protected void reduceStock() {
        if (stock > 0) {
            stock--;
        }
    }

    // Polymorphic behavior
    abstract double applyDiscount(double total);
}

