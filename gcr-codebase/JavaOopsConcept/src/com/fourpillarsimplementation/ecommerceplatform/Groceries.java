package com.fourpillarsimplementation.ecommerceplatform;

class Groceries extends Product {

    Groceries(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.05;   // 5% discount
    }
}
