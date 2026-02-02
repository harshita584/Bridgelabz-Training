package com.tailorshop;

import java.time.LocalTime;
import java.util.ArrayList;

public class DeliveryDeadline {
	private static void addOrder(ArrayList<Order> orders, Order order) {
		orders.add(order);
		int j = orders.size()-2;
		
		
		while(j >= 0 && orders.get(j).time.isAfter(orders.get(j+1).time)) {
			Order temp = orders.get(j);
			orders.set(j, orders.get(j+1));
			orders.set(j+1, temp);
			j--;
		}
	}
	
	public static void main(String[] args) {
		ArrayList<Order> orders = new ArrayList<>();
		orders.add(new Order(0, LocalTime.of(8, 0)));
		orders.add(new Order(1, LocalTime.of(9, 0)));
		orders.add(new Order(2, LocalTime.of(9, 30)));
		orders.add(new Order(3, LocalTime.of(9, 50)));
		
		System.out.println(orders);
		
		addOrder(orders, new Order(5, LocalTime.of(8, 30)));
		System.out.println(orders);
		
		addOrder(orders, new Order(6, LocalTime.of(9, 30)));
		System.out.println(orders);
	}
}
