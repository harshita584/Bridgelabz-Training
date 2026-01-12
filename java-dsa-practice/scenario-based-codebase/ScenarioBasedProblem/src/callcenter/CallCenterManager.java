package callcenter;

import java.util.*;

public class CallCenterManager {
    private Queue<Customer> regularQueue;
    private Queue<Customer> vipQueue;
    private Map<String, Integer> callHistory;

    public CallCenterManager() {
        this.regularQueue = new LinkedList<>();
        this.vipQueue = new LinkedList<>();
        this.callHistory = new HashMap<>();
    }

    
    public void receiveCall(String name, boolean isVIP) {
        Customer customer = new Customer(name, isVIP);
        
        
        callHistory.put(name, callHistory.getOrDefault(name, 0) + 1);
        
        
        if (isVIP) {
            vipQueue.add(customer);
            System.out.println(" Queued to VIP line: " + name);
        } else {
            regularQueue.add(customer);
            System.out.println(" Queued to Regular line: " + name);
        }
    }

    
    public void processNextCall() {
        if (!vipQueue.isEmpty()) {
            System.out.println("Processing VIP: " + vipQueue.poll());
        } else if (!regularQueue.isEmpty()) {
            System.out.println("Processing Regular: " + regularQueue.poll());
        } else {
            System.out.println("No calls waiting in any queue.");
        }
    }

    public void displayCallStats(String name) {
        int count = callHistory.getOrDefault(name, 0);
        System.out.println("History: " + name + " has called " + count + " times.");
    }
}