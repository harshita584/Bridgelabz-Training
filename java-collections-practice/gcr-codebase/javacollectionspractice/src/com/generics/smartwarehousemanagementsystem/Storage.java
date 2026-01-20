package com.generics.smartwarehousemanagementsystem;

import java.util.*;

public class Storage<T extends WarehouseItem> {
	ArrayList<T> items = new ArrayList<>();
	
	public void addItem(T t) {
		items.add(t);
	}
	
	public void show() {
		System.out.println(items);
	}
}