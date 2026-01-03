package com.fourpillarsimplementation.onlinefooddeliverysystem;

public class VegItem extends FoodItem implements Discountable{

	public VegItem(String itemName, double price, int quantity) {
		super(itemName, price, quantity);
	}

	@Override
	double calculateTotalPrice() {
		return price*quantity;
	}

	@Override
	public double applyDiscount() {
		return 0.01;
	}

	@Override
	public void getDiscountDetails() {
	    double discountRate = applyDiscount(); // 0.01
	    double totalPrice = calculateTotalPrice();

	    double discountAmount = totalPrice * discountRate;
	    double finalPrice = totalPrice - discountAmount;

	    System.out.println("Discount rate: " + (discountRate * 100) + "%");
	    System.out.println("Discount amount: " + discountAmount);
	    System.out.println("Total price after discount: " + finalPrice);
	}


}
