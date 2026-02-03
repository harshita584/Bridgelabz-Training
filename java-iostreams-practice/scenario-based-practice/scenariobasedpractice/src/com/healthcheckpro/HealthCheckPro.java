package com.healthcheckpro;

import java.lang.reflect.Method;

public class HealthCheckPro {
    public static void main(String[] args) {
        Class<?> cls = LabController.class;
        Method[] methods = cls.getDeclaredMethods();

        System.out.println("API Documentation");

        for (Method m : methods) {
            if (m.isAnnotationPresent(PublicAPI.class)) {
                PublicAPI api = m.getAnnotation(PublicAPI.class);

                System.out.println("Method Name : " + m.getName());
                System.out.println("Description : " + api.description());

                if (m.isAnnotationPresent(RequiresAuth.class)) System.out.println("Auth Needed : YES");
                else System.out.println("Auth Needed : NO");
            } 
            else System.out.println("WARNING: " + m.getName() + " missing @PublicAPI");
        }
    }
}
