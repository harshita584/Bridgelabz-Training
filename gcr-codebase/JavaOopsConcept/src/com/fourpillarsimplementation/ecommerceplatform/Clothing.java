package com.fourpillarsimplementation.ecommerceplatform;

class Clothing extends Product implements Taxable {

    Clothing(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.20;   // 20% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.05;   // 5% tax
    }

    @Override
    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}
