package com.multithreading.printshopjobscheduler;

public class Driver {

    public static void main(String[] args) {

        System.out.println("Starting print jobs...");

        long start = System.currentTimeMillis();
        Thread t1 = new Thread(new PrintJob("Job1", 10, 5));
        Thread t2 = new Thread(new PrintJob("Job2", 5, 8));
        Thread t3 = new Thread(new PrintJob("Job3", 15, 3));
        Thread t4 = new Thread(new PrintJob("Job4", 8, 6));
        Thread t5 = new Thread(new PrintJob("Job5", 12, 7));

        t1.setPriority(5);
        t2.setPriority(8);
        t3.setPriority(3);
        t4.setPriority(6);
        t5.setPriority(7);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();

        try {
            t1.join();
            t2.join();
            t3.join();
            t4.join();
            t5.join();
        } 
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        
        long end = System.currentTimeMillis();
        System.out.println("All jobs completed in " + (end - start));
    }
}
