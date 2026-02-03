package com.lambdaexpression.customsortinginecommerce;

import java.util.*;

public class EcommerceSorting {
    public static void main(String[] args) {
        List<Product> products = new ArrayList<>();

        products.add(new Product("Phone", 50000, 4, 10));
        products.add(new Product("Laptop", 80000, 5, 15));
        products.add(new Product("Headphones", 3000, 3, 5));

        products.sort((a, b) -> a.price - b.price);
        for (Product p : products) {
            System.out.println(p.name);
        }
        System.out.println();
        
        products.sort((a, b) -> b.rating - a.rating);
        for (Product p : products) {
            System.out.println(p.name);
        }
        System.out.println();
        
        products.sort((a, b) -> b.discount - a.discount);
        for (Product p : products) {
            System.out.println(p.name);
        }
        System.out.println();
    }
}
