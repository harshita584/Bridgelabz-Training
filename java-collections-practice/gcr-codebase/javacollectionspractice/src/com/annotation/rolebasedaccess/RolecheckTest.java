package com.annotation.rolebasedaccess;

import java.lang.reflect.Method;

public class RolecheckTest {

    public static void main(String[] args) throws Exception {

        String currentUserRole1 = "ADMIN";
        String currentUserRole2 = "USER";

        invokeIfAllowed(AdminService.class, currentUserRole1);
        invokeIfAllowed(AdminService.class, currentUserRole2);
    }

    public static void invokeIfAllowed(Class<?> clazz, String userRole) throws Exception {

        // Check if class has @RoleAllowed
        if (clazz.isAnnotationPresent(RoleAllowed.class)) {

            RoleAllowed roleAllowed = clazz.getAnnotation(RoleAllowed.class);

            if (roleAllowed.value().equals(userRole)) {
                // Access granted → invoke all methods
                Object instance = clazz.getDeclaredConstructor().newInstance();

                for (Method method : clazz.getDeclaredMethods()) {
                    method.invoke(instance);
                }
            } else {
                // Access denied
                System.out.println("Access Denied for role: " + userRole);
            }
        }
    }
}
