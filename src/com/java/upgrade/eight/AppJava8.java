package com.java.upgrade.eight;

import com.java.upgrade.eight.defaultmethods.Circle;
import com.java.upgrade.eight.defaultmethods.Shape;
import com.java.upgrade.eight.lambdaemp.LambdaExamples;
import com.java.upgrade.eight.streamsapi.StreamsApi;

public class AppJava8 {


    public static void main(String[] args) {
        System.out.println("Hello, World Java 8!");

       
       
    }

    private static void testDefaultInterfaces(){
        Circle circle = new Circle();
        circle.draw(); // Calls the overridden draw method
        circle.resize(); // Calls the default resize method
        Shape.show(); // Calls the static method directly
    }

    private static void testStreamApi(){
        System.out.println("StreamsApi Example 1");
        StreamsApi.filterNames();

        System.out.println("StreamsApi Example 2");
        StreamsApi.streamSumRangeAndReduce();

        System.out.println("StreamsApi Example 3");
        StreamsApi.infiniteStream();
    }

    private static void testLambdas(){
        System.out.println("Lambda Example 1");
        LambdaExamples.calculateSum();

        System.out.println("Lambda Example 2");
        LambdaExamples.lambdaSorting();

        System.out.println("Lambda Example 3");
        LambdaExamples.listSort();
    }

}
