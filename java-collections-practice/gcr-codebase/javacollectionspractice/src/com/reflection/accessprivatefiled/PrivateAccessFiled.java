package com.reflection.accessprivatefiled;
import java.lang.reflect.Field;

public class PrivateAccessFiled {
    public static void main(String[] args) throws Exception {

        Person person = new Person();

        Class<?> clazz = person.getClass();

        Field ageField = clazz.getDeclaredField("age");
        ageField.setAccessible(true); // allow private access

        // Modify value
        ageField.set(person, 30);

        // Retrieve value
        int age = (int) ageField.get(person);

        System.out.println("Updated Age: " + age);
    }
}
