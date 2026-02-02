package com.annotation.importantmethod;

import java.lang.reflect.Method;

public class ImportantMethodTest {

    public static void main(String[] args) {

        Class<Service> clazz = Service.class;

        for (Method method : clazz.getDeclaredMethods()) {

            if (method.isAnnotationPresent(ImportantMethod.class)) {

                ImportantMethod im =
                        method.getAnnotation(ImportantMethod.class);

                System.out.println(
                    "Method: " + method.getName() +
                    ", Level: " + im.level()
                );
            }
        }
    }
}
