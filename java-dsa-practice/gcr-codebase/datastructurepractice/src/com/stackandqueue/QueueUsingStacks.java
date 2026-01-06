package com.stackandqueue;

import java.util.Stack;

public class QueueUsingStacks {

    private Stack<Integer> s1 = new Stack<>(); // enqueue stack
    private Stack<Integer> s2 = new Stack<>(); // dequeue stack

    // Enqueue operation
    public void enqueue(int data) {
        s1.push(data);
        System.out.println(data + " enqueued");
    }

    // Dequeue operation
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.pop();
    }

    // Peek operation
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }

        if (s2.isEmpty()) {
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
        }
        return s2.peek();
    }

    // Check empty
    public boolean isEmpty() {
        return s1.isEmpty() && s2.isEmpty();
    }

    // Main method for testing
    public static void main(String[] args) {

        QueueUsingStacks queue = new QueueUsingStacks();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Front: " + queue.peek());

        queue.enqueue(40);

        System.out.println("Dequeued: " + queue.dequeue());
        System.out.println("Dequeued: " + queue.dequeue());
    }
}
