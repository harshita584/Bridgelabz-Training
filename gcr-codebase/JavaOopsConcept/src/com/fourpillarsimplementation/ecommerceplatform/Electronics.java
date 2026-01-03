package com.fourpillarsimplementation.ecommerceplatform;

class Electronics extends Product implements Taxable {

    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    @Override
    double calculateDiscount() {
        return getPrice() * 0.10;   // 10% discount
    }

    @Override
    public double calculateTax() {
        return getPrice() * 0.18;   // 18% tax
    }

    @Override
    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}
