package com.perscholas.java_basics.GLAB_303_11_6;

import java.util.TreeMap;

public class ExampleTreeMapOne {
    public static void main(String[] args) {
        TreeMap<String,Integer> numbers = new TreeMap<>();
        numbers.put("one", 1);
        numbers.put("two", 2);
        numbers.put("three", 3);
        System.out.println("TreeMap: " + numbers);

        //remove method single parameter
        int value = numbers.remove("two");
        System.out.println("Removed Value: " + value);

        //remove method with two parameters
        boolean result = numbers.remove("three", 3);
        System.out.println("Is the entry {three=3} removed?: " + result);
        System.out.println("Updated TreeMap: " + numbers);
    }
}
