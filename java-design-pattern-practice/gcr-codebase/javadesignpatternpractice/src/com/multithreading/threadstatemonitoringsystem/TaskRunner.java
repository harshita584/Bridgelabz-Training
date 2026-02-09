package com.multithreading.threadstatemonitoringsystem;

public class TaskRunner extends Thread {
    public void run() {
        try {
            for (int i = 0; i < 1000; i++) {}
            Thread.sleep(2000);
            for (int i = 0; i < 1000; i++) {}
        } 
        catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
