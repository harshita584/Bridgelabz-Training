package com.generics.smartwarehousemanagementsystem;

public class DriverClass {
	public static void main(String[] args) {
		Storage<Electronics> electronics = new Storage<>();
		electronics.addItem(new Electronics("Electronics 1", 1000));
		electronics.addItem(new Electronics("Electronics 2", 1500));
		electronics.addItem(new Electronics("Electronics 3", 500));
		electronics.show();
		
		Storage<Furniture> furniture = new Storage<Furniture>();
		furniture.addItem(new Furniture("Furniture 1", 10000));
		furniture.addItem(new Furniture("Furniture 2", 15000));
		furniture.addItem(new Furniture("Furniture 3", 5000));
		furniture.show();
	}
}