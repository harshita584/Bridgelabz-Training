package com.productinventory;

import java.util.ArrayList;

public class OnlineStore {
	public static Node search(Node root, int sku) {
		if(root == null) return null;
		if(root.sku == sku) return root;
		
		Node left = search(root.left, sku);
		if(left != null) return left;
		
		return search(root.right, sku);
	}
	
	public static boolean update(Node root, String details, int sku) {
		if(root == null) return false;
		
		if(root.sku == sku) {
			root.details = details;
			return true;
		}
		return update(root.left, details, sku) || update(root.right, details, sku);
	}
	
	public static void sortedList(Node root, ArrayList<Node> result) {
		if(root == null) return;
		
		sortedList(root.left, result);
		result.add(root);
		sortedList(root.right, result);
	}
	
	public static void main(String[] args) {
		Node root = new Node(50, "Laptop");

        Node n30 = new Node(30, "Keyboard");
        Node n70 = new Node(70, "Monitor");

        Node n20 = new Node(20, "Mouse");
        Node n40 = new Node(40, "Webcam");

        Node n60 = new Node(60, "Printer");
        Node n80 = new Node(80, "Router");

        root.left = n30;
        root.right = n70;

        n30.left = n20;
        n30.right = n40;

        n70.left = n60;
        n70.right = n80;
        
        ArrayList<Node> list = new ArrayList<Node>();
        sortedList(root, list);
        System.out.println(list);
        
        System.out.println(search(root, 20));
        update(root, "Updated keyword", 30);
        
        list.clear();
        sortedList(root, list);
        System.out.println(list);
	}
}
