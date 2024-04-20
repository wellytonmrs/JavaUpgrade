package com.java.upgrade.eight.lambdaemp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaExamples {

    public static void calculateSum() {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println("Numbers: " + numbers);
        // Calculate the sum using lambda expression
        int sum = numbers.stream().reduce(0, (a, b) -> a + b);

        System.out.println("Sum of numbers: " + sum);
    }

    public static void lambdaSorting(){
        List<Person> people = new ArrayList<>();
        people.add(new Person("Alice", 30));
        people.add(new Person("Bob", 25));
        people.add(new Person("Charlie", 35));

        people.sort(Comparator.comparingInt(Person::getAge));
        
        System.out.println("Sorted people by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }

    public static void listSort(){
        List<String> words = Arrays.asList("apple", "date", "banana", "fig", "cherry");

        words.sort((a, b) -> Integer.compare(a.length(), b.length()));

        System.out.println("Sorted by length: ");
        words.forEach(System.out::println);
    }
}
