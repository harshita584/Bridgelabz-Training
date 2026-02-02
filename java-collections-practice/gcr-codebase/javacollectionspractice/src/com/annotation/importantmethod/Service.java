package com.annotation.importantmethod;

public class Service {

    @ImportantMethod
    public void saveData() {
        System.out.println("Saving data...");
    }

    @ImportantMethod(level = "LOW")
    public void logData() {
        System.out.println("Logging data...");
    }

    public void helperMethod() {
        System.out.println("Helper method");
    }
}
