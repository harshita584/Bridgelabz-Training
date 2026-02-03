package com.functionalinterfaces.sensitivedatatagging;

public class EncryptCheck {
    public static void main(String[] args) {
        Student student = new Student("Student name");
        System.out.println(student instanceof SensitiveData);
    }
}
