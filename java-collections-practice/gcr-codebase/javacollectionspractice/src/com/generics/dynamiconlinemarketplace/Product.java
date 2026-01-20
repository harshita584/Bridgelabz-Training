package com.generics.dynamiconlinemarketplace;

public class Product<T extends Category>{
	String name;
	int price;
	T category;
	
	public Product(String name, int price, T category) {
		this.name = name;
		this.price = price;
		this.category = category;
	}
	
	public String toString() {
		return name + " " + price + " " + category.getCategory();
	}
}
