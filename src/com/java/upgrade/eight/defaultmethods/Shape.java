package com.java.upgrade.eight.defaultmethods;

public interface Shape {

    void draw(); //abastract method

    default void resize(){
        System.out.println("Resizing shape");
    }

    static void show(){
        System.out.println("Static Method show() Executed");
    }

}
