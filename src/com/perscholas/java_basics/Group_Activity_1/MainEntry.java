package com.perscholas.java_basics.Group_Activity_1;

import java.util.Scanner;

public class MainEntry {

private String operation;
private int[] numbers = new int[2];
Scanner input = new Scanner(System.in);

    //add
    Calc <Integer> add = new Calc(){
        @Override
        public Integer compute(int[] arr) {
            return arr[0] + arr[1];
        }
    };

    //subtraction
    Calc <Integer> sub = new Calc(){
        @Override
        public Integer compute(int[] arr){
        return arr[0] - arr[1];
        }
    };

    //multiplication
    Calc <Integer> mul = new Calc(){
        @Override
        public Integer compute(int[] arr){
            return arr[0] * arr[1];
        }
    };

    //division
    Calc <Integer> div = new Calc(){
        public Integer compute(int[] arr){
            return arr[0]/ arr[1];
        }
    };

    //method to ask for operation:
    public void setOperation() {
        System.out.println("Enter operation: ");
        operation = input.next();
    }
    //method to ask for numbers
    public void setNumbers() {
        for(int i = 0; i < numbers.length; i++){
            System.out.println("Please enter a number");
            numbers[i]= input.nextInt();
        }
    }


    public void operatingCalc (){
        switch (operation) {
            case "+":
                System.out.println(add.compute(numbers)); break;
            case "-":
                System.out.println(sub.compute(numbers)); break;
            case "*":
                System.out.println(mul.compute(numbers)); break;
            case "/":
                System.out.println(div.compute(numbers)); break;
            default: System.out.println("Invalid operation");
        };
    }
}
