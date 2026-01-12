package trafficmanager;

import java.util.LinkedList;
import java.util.Queue;

public class TrafficManager {

    // Vehicle node for Circular Linked List
    static class Vehicle {
        String vehicleNumber;
        Vehicle next;

        Vehicle(String vehicleNumber) {
            this.vehicleNumber = vehicleNumber;
            this.next = null;
        }
    }

    private Vehicle head = null;
    private Vehicle tail = null;

    private Queue<String> waitingQueue = new LinkedList<>();
    private int maxQueueSize = 5;

    // Add vehicle to waiting queue
    public void addToQueue(String vehicleNumber) {
        if (waitingQueue.size() == maxQueueSize) {
            System.out.println("Queue Overflow! Vehicle cannot enter now.");
            return;
        }
        waitingQueue.add(vehicleNumber);
        System.out.println("Vehicle " + vehicleNumber + " added to waiting queue.");
    }

    // Move vehicle from queue to roundabout
    public void enterRoundabout() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Queue Underflow! No vehicles waiting.");
            return;
        }

        String vehicleNumber = waitingQueue.poll();
        Vehicle newVehicle = new Vehicle(vehicleNumber);

        if (head == null) {
            head = tail = newVehicle;
            newVehicle.next = head;
        } else {
            tail.next = newVehicle;
            newVehicle.next = head;
            tail = newVehicle;
        }

        System.out.println("Vehicle " + vehicleNumber + " entered the roundabout.");
    }

    // Remove vehicle from roundabout
    public void exitRoundabout(String vehicleNumber) {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle current = head;
        Vehicle previous = tail;

        do {
            if (current.vehicleNumber.equals(vehicleNumber)) {

                if (current == head && current == tail) {
                    head = tail = null;
                } else {
                    previous.next = current.next;

                    if (current == head) {
                        head = head.next;
                        tail.next = head;
                    }

                    if (current == tail) {
                        tail = previous;
                    }
                }

                System.out.println("Vehicle " + vehicleNumber + " exited the roundabout.");
                return;
            }
            previous = current;
            current = current.next;
        } while (current != head);

        System.out.println("Vehicle not found in roundabout.");
    }

    // Display roundabout vehicles
    public void displayRoundabout() {
        if (head == null) {
            System.out.println("Roundabout is empty.");
            return;
        }

        Vehicle temp = head;
        System.out.print("Roundabout Vehicles: ");
        do {
            System.out.print(temp.vehicleNumber + " -> ");
            temp = temp.next;
        } while (temp != head);
        System.out.println("(back to start)");
    }

    // Display waiting queue
    public void displayQueue() {
        if (waitingQueue.isEmpty()) {
            System.out.println("Waiting queue is empty.");
            return;
        }
        System.out.println("Waiting Queue: " + waitingQueue);
    }

    // Main method
    public static void main(String[] args) {

        TrafficManager tm = new TrafficManager();

        tm.addToQueue("MH12A101");
        tm.addToQueue("MH12B202");
        tm.addToQueue("MH12C303");

        tm.enterRoundabout();
        tm.enterRoundabout();

        tm.displayRoundabout();
        tm.displayQueue();

        tm.exitRoundabout("MH12A101");
        tm.displayRoundabout();

        tm.enterRoundabout();
        tm.displayRoundabout();
    }
}
