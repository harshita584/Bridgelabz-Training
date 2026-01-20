package com.collections.designproblems;

import java.util.*;

public class ShoppingCart {
    private Map<String, Integer> priceMap = new HashMap<>();
    private Map<String, Integer> cartOrder = new LinkedHashMap<>();

    public void addProduct(String product, int price, int quantity) {
        priceMap.put(product, price);
        cartOrder.put(product, cartOrder.getOrDefault(product, 0) + quantity);
    }

    public void displayCartOrder() {
        System.out.println("Cart Items : ");
        
        for (String product : cartOrder.keySet()) {
            System.out.println(priceMap.get(product) + " " + cartOrder.get(product));
        }
    }

    public void displaySortedByPrice() {
        System.out.println("Cart Items (Sorted by Price):");

        TreeMap<Integer, List<String>> sortedMap = new TreeMap<>();

        for (String product : cartOrder.keySet()) {
            int price = priceMap.get(product);
            if(!sortedMap.containsKey(price)) sortedMap.put(price, new ArrayList<>());
            sortedMap.get(price).add(product);
        }

        for (Map.Entry<Integer, List<String>> entry : sortedMap.entrySet()) {
            for (String product : entry.getValue()) {
                System.out.println(entry.getKey() + " " + cartOrder.get(product));
            }
        }
    }

    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addProduct("Laptop", 60000, 1);
        cart.addProduct("Mouse", 800, 2);
        cart.addProduct("Keyboard", 1500, 1);
        cart.addProduct("Headphones", 1500, 1);

        cart.displayCartOrder();
        cart.displaySortedByPrice();
    }
}
