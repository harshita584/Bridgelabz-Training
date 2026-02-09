package com.multithreading.printshopjobscheduler;

public class PrintJob implements Runnable {
    String name;
    int pages;
    int priority;

    public PrintJob(String name, int pages, int priority) {
        this.name = name;
        this.pages = pages;
        this.priority = priority;
    }

    public void run() {
        String level;

        if (priority >= 8) level = "High Priority";
        else if (priority >= 6) level = "Medium Priority";    
        else level = "Low Priority";
        
        for (int i = 1; i <= pages; i++) {
            System.out.println(level + " Printing " +  name + " - Page " + i + " of " + pages);

            try {
                Thread.sleep(100);
            } 
            catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}
