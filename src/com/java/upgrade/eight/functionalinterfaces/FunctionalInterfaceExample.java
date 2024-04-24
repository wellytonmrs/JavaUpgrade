package com.java.upgrade.eight.functionalinterfaces;

public class FunctionalInterfaceExample {

    public static void calculateInterface() {
        Calculator add = (a,b) -> a + b;
        System.err.println("Addition result: " + add.calculate(5, 3));

        Calculator multiply = (a,b) -> a * b;
        System.out.println("Multiplication result: " + multiply.calculate(5, 3));
    }
}
