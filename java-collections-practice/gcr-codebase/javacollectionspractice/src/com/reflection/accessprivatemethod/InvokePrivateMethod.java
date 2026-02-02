package com.reflection.accessprivatemethod;
import java.lang.reflect.Method;

public class InvokePrivateMethod {

    public static void main(String[] args) throws Exception {

        Calculator calculator = new Calculator();

        Class<?> clazz = calculator.getClass();

        Method method = clazz.getDeclaredMethod("multiply", int.class, int.class);
        method.setAccessible(true);

        Object result = method.invoke(calculator, 5, 4);

        System.out.println("Result: " + result);
    }
}
