package com.functionalinterfaces.sensitivedatatagging;

public class Student implements SensitiveData {
    String name;

    public Student(String name) {
        this.name = name;
    }
}
