package com.onlineticketbooking;

import java.time.LocalTime;
import java.util.ArrayList;

public class BookingApp {
    private static Node rightRotate(Node root) {
        Node newRoot = root.left;
        Node temp = newRoot.right;

        newRoot.right = root;
        root.left = temp;

        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));

        return newRoot;
    }

    private static Node leftRotate(Node root) {
        Node newRoot = root.right;
        Node temp = newRoot.left;

        newRoot.left = root;
        root.right = temp;

        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
        newRoot.height = 1 + Math.max(getHeight(newRoot.left), getHeight(newRoot.right));

        return newRoot;
    }
    private static int getHeight(Node node) {
        return node == null ? 0 : node.height;
    }

    private static int getBalance(Node node) {
        return node == null ? 0 : getHeight(node.left) - getHeight(node.right);
    }

    private static Node getMinNode(Node node) {
        while (node.left != null) node = node.left;
        return node;
    }
    
    private static Node insert(Node root, String name, LocalTime time) {
        if (root == null) return new Node(name, time);

        if (time.isBefore(root.startTime)) root.left = insert(root.left, name, time);
        else if (time.isAfter(root.startTime)) root.right = insert(root.right, name, time);
        else return root;

        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
        int balance = getBalance(root);

        if (balance > 1 && time.isBefore(root.left.startTime)) {
        	return rightRotate(root);
        }
        if (balance < -1 && time.isAfter(root.right.startTime)) {
        	return leftRotate(root);
        }
            
        if (balance > 1 && time.isAfter(root.left.startTime)) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && time.isBefore(root.right.startTime)) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    private static Node delete(Node root, LocalTime time) {
        if (root == null) return null;

        if (time.isBefore(root.startTime)) root.left = delete(root.left, time);
        else if (time.isAfter(root.startTime)) root.right = delete(root.right, time);
        else {
        	if(root.left == null && root.right == null) return null;
        	else if(root.left == null) return root.right;
        	else if(root.right == null) return root.left;
        	
            else {
                Node successor = getMinNode(root.right);
                root.name = successor.name;
                root.startTime = successor.startTime;
                root.right = delete(root.right, successor.startTime);
            }
        }

        if (root == null) return null;

        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));
        int balance = getBalance(root);

        if (balance > 1 && getBalance(root.left) >= 0) {
        	return rightRotate(root);
        }

        if (balance > 1 && getBalance(root.left) < 0) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && getBalance(root.right) <= 0) {
            return leftRotate(root);
        }

        if (balance < -1 && getBalance(root.right) > 0) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    private static void getEventsInOrder(Node root, ArrayList<Node> list) {
        if (root == null) return;
        
        getEventsInOrder(root.right, list);
        list.add(root);
        getEventsInOrder(root.left, list);
    }

    public static void main(String[] args) { 
    	Node root = null; for(int i = 1; i < 10; i++) {
    		root = insert(root, "Event " + i, LocalTime.of(i, 30)); 
    	} 
    	ArrayList<Node> list = new ArrayList<>(); 
    	
    	getEventsInOrder(root, list); 
    	System.out.println(list); 
    	
    	delete(root, LocalTime.of(1, 30)); 
    	list.clear(); getEventsInOrder(root, list); 
    	System.out.println(list); 
    }
}








