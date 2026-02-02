package com.musicapp;

import java.util.*;

public class SongsApp {
    public static Node insert(Node root, Node song) {
        if (root == null) return song;

        if (song.trackId < root.trackId) root.left = insert(root.left, song);
        else root.right = insert(root.right, song);

        return root;
    }

    public static Node search(Node root, int trackId) {
        if (root == null || root.trackId == trackId) return root;

        if (trackId < root.trackId) return search(root.left, trackId);
        else return search(root.right, trackId);
    }

    public static void collect(Node root, ArrayList<Node> list) {
        if (root == null) return;

        collect(root.left, list);
        list.add(root);
        collect(root.right, list);
    }

    public static void main(String[] args) {
        Node root = new Node(50, "Perfect");

        Node n30 = new Node(30, "Believer");
        Node n70 = new Node(70, "Thunder");

        Node n20 = new Node(20, "Closer");
        Node n40 = new Node(40, "Faded");

        Node n60 = new Node(60, "Memories");
        Node n80 = new Node(80, "Shape of You");

        root.left = n30;
        root.right = n70;

        n30.left = n20;
        n30.right = n40;

        n70.left = n60;
        n70.right = n80;

        System.out.println("Search Track 40:");
        
        System.out.println(search(root, 40));
        
        root = insert(root, new Node(65, "Attention"));
        
        ArrayList<Node> playlist = new ArrayList<>();
        collect(root, playlist);

        Collections.sort(playlist, (a, b) -> a.title.compareTo(b.title));

        for (Node song : playlist) {
            System.out.print(song + "   ");
        }
    }
}
