package com.perscholas.java_basics.Practice_KBA_303_Lambda_Expression;

import java.util.ArrayList;
import java.util.Arrays;

public class LambdaExpression {
    public static void main(String[] args) {
//        1.Use the three different types of lambda expressions with a forEach() or removeIf method.

        String[] name = { "Peter","John", "James","Simon","Bartholomew","Andrew","Jude","Matthew"};

        Integer[] numbers ={1,2,3,5,6,7,8,9,10};


        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(name));
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(numbers)); new ArrayList<>(Arrays.asList(numbers));

        //Return Names:
        nameList.forEach( person-> System.out.println(person));
        numList.forEach( (num)-> System.out.println(num));
        nameList.forEach( (person) -> {
            System.out.println(person);
        });

    }
}
