package com.java.upgrade.eight.typeannotations;

// Importing required packages for repeating annotation   
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

// Declaring repeatable annotation type  
@Repeatable(Schedules.class)
@interface Schedule {
    String dayOfMonth() default "first";

    String dayOfWeek() default "Mon";

    int hour() default 12;
}

// Declaring container for repeatable annotation type
@Retention(RetentionPolicy.RUNTIME)
@interface Schedules {
    Schedule[] value();
}

public class Person {
    @NonNull
    String name;
    @ValidAge
    int age;

    public Person(@NonNull String name, @ValidAge int age) {
        this.name = name;
        this.age = age;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    @Schedule(dayOfMonth = "last")
    @Schedule(dayOfWeek = "Fri", hour = 23)
    public void doPeriodicCleanup() {
        // Method implementation
    }

    public static void main(String[] args) {
        Person person = new Person("John", 30);
        person.displayInfo();

        Person person2 = new Person(null, 30);
        person2.displayInfo();
    }

}
