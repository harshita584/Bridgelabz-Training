package com.fourpillarsimplementation.onlinefooddeliverysystem;

abstract class FoodItem {
   String itemName;
   double price;
   int quantity;
   
   // encapsulated state
   private String customerName = "Harshita Patel";
   private String deliveryAddress = "MinalResidency";
  
   
   public String getCustomerName() {
	return customerName;
}

   public String getDeliveryAddress() {
	return deliveryAddress;
   }

   public FoodItem(String itemName, double price, int quantity) {
	this.itemName = itemName;
	this.price = price;
	this.quantity = quantity;
}

   abstract double calculateTotalPrice();
   
   public void getItemDetails() {
       System.out.println("Item Name: " + itemName);
       System.out.println("Price: " + price);
       System.out.println("Quantity: " + quantity);
   }
}
