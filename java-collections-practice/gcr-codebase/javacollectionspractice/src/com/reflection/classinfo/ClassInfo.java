package com.reflection.classinfo;
import java.lang.reflect.*;

public class ClassInfo {

    public static void main(String[] args) throws Exception {

        // Input class name
        String className = "java.util.ArrayList";

        Class<?> clazz = Class.forName(className);

        System.out.println("Class Name: " + clazz.getName());

        // Fields
        System.out.println("\n--- Fields ---");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field);
        }

        // Constructors
        System.out.println("\n--- Constructors ---");
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor);
        }

        // Methods
        System.out.println("\n--- Methods ---");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method);
        }
    }
}
