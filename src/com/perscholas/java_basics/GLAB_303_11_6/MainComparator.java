package com.perscholas.java_basics.GLAB_303_11_6;

import java.util.TreeMap;

public class MainComparator {
    public static void main(String[] args) {
        //Creating treemap with a customized comparator

        TreeMap <String,Integer> numbers = new TreeMap<>(new CustomComparator());

        numbers.put("first",1);
        numbers.put("second",2);
        numbers.put("third",3);
        numbers.put("fourth",4);

        System.out.println("TreeMap: " + numbers);


    }
}
