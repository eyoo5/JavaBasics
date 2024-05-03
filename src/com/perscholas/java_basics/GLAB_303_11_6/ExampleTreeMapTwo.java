package com.perscholas.java_basics.GLAB_303_11_6;

import java.util.TreeMap;

public class ExampleTreeMapTwo {
    public static void main(String[] args) {
        TreeMap<String,Integer> numbers = new TreeMap<>();
        numbers.put("first", 1);
        numbers.put("second", 2);
        numbers.put("third", 3);
        System.out.println("TreeMap: " + numbers);

        //using the fistKey() method
        String firstKey = numbers.firstKey();
        System.out.println("First key: " + firstKey);

        //Using the lastKey() method
        String lastKey = numbers.lastKey();
        System.out.println("Last key: " + lastKey);

        //Using entry methods to get key/values pairs
        System.out.println("First Entry: " + numbers.firstEntry());
        System.out.println("Last Entry: " + numbers.lastEntry());
    }
}
