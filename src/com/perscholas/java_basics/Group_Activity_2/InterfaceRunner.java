package com.perscholas.java_basics.Group_Activity_2;

public class InterfaceRunner {
    public static void main(String[] args) {
        GroupThreeFunctionalInterface <String,Integer> strLength = str-> str.length();
        System.out.println(strLength.transform("Testing"));
    }
}
