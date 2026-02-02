package com.gamingapp;

import java.util.ArrayList;

public class App {
    private static int getHeight(Node node) {
        return node == null ? 0 : node.height;
    }

    private static int getBalance(Node node) {
        return node == null ? 0 : getHeight(node.left) - getHeight(node.right);
    }

    private static Node rightRotate(Node node) {
        Node x = node.left;
        Node y = x.right;

        x.right = node;
        node.left = y;

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));

        return x;
    }

    private static Node leftRotate(Node node) {
        Node x = node.right;
        Node y = x.left;

        x.left = node;
        node.right = y;

        node.height = 1 + Math.max(getHeight(node.left), getHeight(node.right));
        x.height = 1 + Math.max(getHeight(x.left), getHeight(x.right));

        return x;
    }
    
    private static Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) current = current.left;
        return current;
    }
    
    private static Node delete(Node root, int points) {
        if (root == null) return null;

        if (points < root.points) root.left = delete(root.left, points);
        else if (points > root.points) root.right = delete(root.right, points);
        else {
            if (root.left == null && root.right == null) return null;

            if (root.left == null) return root.right;

            if (root.right == null) return root.left;

            Node successor = minValueNode(root.right);
            root.points = successor.points;
            root.name = successor.name;
            root.right = delete(root.right, successor.points);
        }

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



    private static Node insertNode(Node root, int points, String name) {
        if (root == null) return new Node(name, points);

        if (points > root.points) root.right = insertNode(root.right, points, name);
        
        else if (points < root.points) root.left = insertNode(root.left, points, name);
        else return root;

        root.height = 1 + Math.max(getHeight(root.left), getHeight(root.right));

        int balance = getBalance(root);

        if (balance > 1 && points < root.left.points)
            return rightRotate(root);

        if (balance < -1 && points > root.right.points)
            return leftRotate(root);

        if (balance > 1 && points > root.left.points) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (balance < -1 && points < root.right.points) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }
    
    private static Node update(Node root, int oldPoints, String newName, int newPoints) {
    	root = delete(root, oldPoints);
    	return insertNode(root, newPoints, newName);
    }

    private static void getTopTen(Node root, ArrayList<Node> topPlayers) {
        if (root == null || topPlayers.size() >= 10)
            return;

        getTopTen(root.right, topPlayers);
        if (topPlayers.size() < 10) topPlayers.add(root);
        getTopTen(root.left, topPlayers);
    }

    public static void main(String[] args) {
        Node root = null;

        root = insertNode(root, 1200, "Player 1");
        root = insertNode(root, 1500, "Player 2");
        root = insertNode(root, 900, "Player 3");
        root = insertNode(root, 1800, "Player 4");
        root = insertNode(root, 1100, "Player 5");

        ArrayList<Node> list = new ArrayList<>();
        getTopTen(root, list);
        System.out.println(list);
        
        root = delete(root, 900);
        list.clear();
        getTopTen(root, list);
        System.out.println(list);
        
        update(root, 1200, "Updated player 1", 1600);
        list.clear();
        getTopTen(root, list);
        System.out.println(list);
    }
}
