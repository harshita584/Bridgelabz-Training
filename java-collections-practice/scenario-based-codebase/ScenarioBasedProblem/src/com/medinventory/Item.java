package com.medinventory;

import java.util.Objects;

public class Item<T> {
    private String itemId;
    private String name;
    private int quantity;
    private String expiryDate;
    private T type;

    public Item(String itemId, String name, int quantity, String expiryDate, T type) {
        this.itemId = itemId;
        this.name = name;
        this.quantity = quantity;
        this.expiryDate = expiryDate;
        this.type = type;
    }

    public String getItemId() {
        return itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public String toString() {
        return itemId + " " + name + " " + quantity + " " + expiryDate;
    }

    public boolean equals(Object o) {
        if(this == o) return true;
        if(!(o instanceof Item)) return false;
        Item<?> item = (Item<?>) o;
        return itemId.equals(item.itemId);
    }

    public int hashCode() {
        return Objects.hash(itemId);
    }
}
