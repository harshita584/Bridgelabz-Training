package com.annotation.customcachingsystem;

public class TestCache {

    public static void main(String[] args) {

        ExpensiveCalculator calc = new ExpensiveCalculator();

        System.out.println(calc.square(5));  
        System.out.println(calc.square(5));  
        System.out.println(calc.square(10));
        System.out.println(calc.square(10)); 
    }
}
