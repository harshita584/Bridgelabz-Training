package com.generics.smartwarehousemanagementsystem;

public abstract class WarehouseItem {
	String name;
	int price;
	
	public WarehouseItem(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public String toString() {
		return name + " " + price;
	}
}