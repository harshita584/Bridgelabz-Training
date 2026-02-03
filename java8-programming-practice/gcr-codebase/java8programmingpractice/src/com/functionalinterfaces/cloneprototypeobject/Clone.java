package com.functionalinterfaces.cloneprototypeobject;

public class Clone {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student p1 = new Student(1, "Student name");
        Student p2 = p1.clone();

        System.out.println(p1.name);
        System.out.println(p2.name);
    }
}
