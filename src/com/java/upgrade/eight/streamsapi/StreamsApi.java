package com.java.upgrade.eight.streamsapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamsApi {

    public static void filterNames() {

        List<String> names = Arrays.asList("John", "Alice", "Bob",
                "Jane", "Charlie");

        List<String> filteredAndUppercaseNames = names.stream()
                .filter(name -> name.startsWith("J"))
                .map(String::toUpperCase)
                .collect(Collectors.toList());

        System.out.println("Filtered and uppercase names: " + filteredAndUppercaseNames);
    }

    public static void streamSumRangeAndReduce(){
        
        int sum  = IntStream.range(1, 10).sum();
        System.out.println("Sum of integers from 1 to 10: " + sum);

        int product = IntStream.range(1, 10).reduce(1, (a,b) -> a * b);
        System.out.println("Product of integers: " + product);

    }

    public static void infiniteStream(){

        Stream<Integer> evenNumbers = Stream.iterate(2, n -> n+2);
        evenNumbers.limit(5).forEach(System.out::println);
    }
}
