package com.annotation.customannotation;

import java.lang.reflect.Method;

public class AnnotationTest {

    public static void main(String[] args) throws Exception {

        TaskManager manager = new TaskManager();

        // Get Class object
        Class<?> clazz = manager.getClass();

        // Get method
        Method method = clazz.getMethod("completeTask");

        // Check if annotation is present
        if (method.isAnnotationPresent(TaskInfo.class)) {

            TaskInfo taskInfo = method.getAnnotation(TaskInfo.class);

            System.out.println("Priority: " + taskInfo.priority());
            System.out.println("Assigned To: " + taskInfo.assignedTo());
        }
    }
}
