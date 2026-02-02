package com.reflection.dynamicmethodinvokation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {

    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter method name: ");
        String methodName = sc.next();   // add / subtract / multiply

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        Class<?> clazz = MathOperations.class;
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Method method = clazz.getMethod(methodName, int.class, int.class);

        Object result = method.invoke(obj, a, b);

        System.out.println("Result: " + result);
    }
}

