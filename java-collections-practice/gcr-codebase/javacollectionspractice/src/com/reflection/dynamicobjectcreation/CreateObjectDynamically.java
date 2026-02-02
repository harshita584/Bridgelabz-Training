package com.reflection.dynamicobjectcreation;


public class CreateObjectDynamically {
    public static void main(String[] args) throws Exception {

        Class<?> clazz = Class.forName("Student");

        // Create object dynamically
        Object obj = clazz.getDeclaredConstructor().newInstance();

        Student student = (Student) obj;
        student.display();
    }
}
