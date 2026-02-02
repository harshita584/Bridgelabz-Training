package com.medinventory;

public class LowStockException extends Exception {
    public LowStockException(String message) {
        super(message);
    }
}
