package com.generics.dynamiconlinemarketplace;

public class DriverClass {
	public static <T extends Product<?>> void applyDiscount(T product) {
		product.price = (product.price / 10) * 9;
	}
	public static void main(String[] args) {
		Product<Book> product = new Product<Book>("Book 1", 250, new Book());
		System.out.println(product);
		applyDiscount(product);
		System.out.println(product);
		
		Product<Gadget> product2 = new Product<Gadget>("Product 1", 500, new Gadget());
		System.out.println(product2);
		applyDiscount(product2);
		System.out.println(product2);
	}
}
