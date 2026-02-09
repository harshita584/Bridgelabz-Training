package com.multithreading.threadstatemonitoringsystem;

public class StateMonitor {
    public static void main(String[] args) {
        TaskRunner t1 = new TaskRunner();
        TaskRunner t2 = new TaskRunner();
        t1.setName("Task-1");
        t2.setName("Task-2");

        System.out.println(t1.getName() + " state: " + t1.getState());
        System.out.println(t2.getName() + " state: " + t2.getState());

        t1.start();
        t2.start();

        while (true) {
            System.out.println(t1.getName() + " state: " + t1.getState());
            System.out.println(t2.getName() + " state: " + t2.getState());

            if (t1.getState() == Thread.State.TERMINATED && t2.getState() == Thread.State.TERMINATED) break;
            try {
                Thread.sleep(500);
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }

        System.out.println("Task-1 and Task-2 went through 4 states");
    }
}
