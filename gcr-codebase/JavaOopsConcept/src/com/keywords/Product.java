package com.keywords;

public class Product {

    // common discount for all products
    static double discount = 0;

    // instance variables
    final String productID;   // ID should not change
    String productName;
    double price;
    int quantity;

    // constructor
    public Product(String productID, String productName, double price, int quantity) {
        this.productID = productID;
        this.productName = productName;
        this.price = price;
        this.quantity = quantity;
    }

    // update discount for all products
    public static void updateDiscount(double newDiscount) {
        if (newDiscount >= 0 && newDiscount <= 100) {
            discount = newDiscount;
        } else {
            System.out.println("Discount must be between 0 and 100");
        }
    }

    // calculate price after discount
    public double getDiscountedPrice() {
        double discountedAmount = price * discount / 100;
        return price - discountedAmount;
    }

    // display product details
    public void displayProductDetails() {

        // checking object type using instanceof
        if (this instanceof Product) {
            System.out.println("Product ID : " + productID);
            System.out.println("Product Name : " + productName);
            System.out.println("Price : " + price);
            System.out.println("Quantity : " + quantity);
            System.out.println("Discount : " + discount + "%");
            System.out.println("Final Price : " + getDiscountedPrice());
        }
    }

    // getters and setters
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public static void main(String[] args) {

        // set discount
        Product.updateDiscount(10);

        // create objects
        Product p1 = new Product("P001", "Laptop", 1200, 5);
        Product p2 = new Product("P002", "Smartphone", 800, 10);

        // display details
        p1.displayProductDetails();
        System.out.println();
        p2.displayProductDetails();
    }
}
