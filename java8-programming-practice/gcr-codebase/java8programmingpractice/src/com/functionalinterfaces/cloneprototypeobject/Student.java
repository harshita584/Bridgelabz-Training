package com.functionalinterfaces.cloneprototypeobject;

public class Student implements Cloneable {
    int id;
    String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    public Student clone() throws CloneNotSupportedException{
    	return (Student) super.clone();
    }
}
