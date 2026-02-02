package com.annotation.loggingexecutiontime;

import java.lang.reflect.Method;

public class ExecutionTimeTest {

    public static void main(String[] args) throws Exception {

        Service service = new Service();
        Class<?> clazz = service.getClass();

        for (Method method : clazz.getDeclaredMethods()) {

            if (method.isAnnotationPresent(LogExecutionTime.class)) {

                long start = System.nanoTime();

                method.invoke(service);   // method call

                long end = System.nanoTime();

                long executionTime = end - start;

                System.out.println(
                    method.getName() + " executed in " +
                    executionTime + " nanoseconds"
                );
            }
        }
    }
}
