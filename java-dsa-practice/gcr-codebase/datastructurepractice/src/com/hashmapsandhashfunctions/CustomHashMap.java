package com.hashmapsandhashfunctions;

public class CustomHashMap<K, V> {

    // Node class
    private class Node {
        K key;
        V value;
        Node next;

        Node(K key, V value) {
            this.key = key;
            this.value = value;
        }
    }

    private int capacity = 16;
    private Node[] buckets;
    private int size = 0;

    // Constructor (FIXED)
    @SuppressWarnings("unchecked")
    public CustomHashMap() {
        buckets = (Node[]) new CustomHashMap.Node[capacity];
    }

    private int getIndex(K key) {
        return (key.hashCode() & 0x7fffffff) % capacity;
    }

    public void put(K key, V value) {
        int index = getIndex(key);
        Node head = buckets[index];

        Node current = head;
        while (current != null) {
            if (current.key.equals(key)) {
                current.value = value;
                return;
            }
            current = current.next;
        }

        Node newNode = new Node(key, value);
        newNode.next = head;
        buckets[index] = newNode;
        size++;
    }

    public V get(K key) {
        int index = getIndex(key);
        Node current = buckets[index];

        while (current != null) {
            if (current.key.equals(key)) {
                return current.value;
            }
            current = current.next;
        }
        return null;
    }

    public void remove(K key) {
        int index = getIndex(key);
        Node current = buckets[index];
        Node prev = null;

        while (current != null) {
            if (current.key.equals(key)) {
                if (prev == null) {
                    buckets[index] = current.next;
                } else {
                    prev.next = current.next;
                }
                size--;
                return;
            }
            prev = current;
            current = current.next;
        }
    }

    public int size() {
        return size;
    }

    public static void main(String[] args) {

        CustomHashMap<String, Integer> map = new CustomHashMap<>();

        map.put("A", 1);
        map.put("B", 2);
        map.put("C", 3);

        System.out.println(map.get("A"));
        System.out.println(map.get("B"));

        map.put("A", 10);
        System.out.println(map.get("A"));

        map.remove("B");
        System.out.println(map.get("B"));

        System.out.println("Size: " + map.size());
    }
}
