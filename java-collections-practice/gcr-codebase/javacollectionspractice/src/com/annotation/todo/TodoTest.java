package com.annotation.todo;
import java.lang.reflect.Method;

public class TodoTest {

    public static void main(String[] args) {

        Class<Project> clazz = Project.class;

        for (Method method : clazz.getDeclaredMethods()) {

            if (method.isAnnotationPresent(Todo.class)) {

                Todo todo = method.getAnnotation(Todo.class);

                System.out.println("Method: " + method.getName());
                System.out.println("Task: " + todo.task());
                System.out.println("Assigned To: " + todo.assignedTo());
                System.out.println("Priority: " + todo.priority());
                System.out.println("            ");
            }
        }
    }
}
