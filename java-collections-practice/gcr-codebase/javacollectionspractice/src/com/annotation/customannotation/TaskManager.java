package com.annotation.customannotation;

public class TaskManager {

    @TaskInfo(priority = 1, assignedTo = "Harshita")
    public void completeTask() {
        System.out.println("Task completed!");
    }
}
