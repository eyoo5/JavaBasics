package com.perscholas.java_basics.PA_303_12_1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try{
            Scanner input = new Scanner(System.in);
            int x = input.nextInt();
            int y = input.nextInt();
            int quotient = x/y;
            System.out.println(quotient);

        }catch(ArithmeticException e){
            System.out.println(e);
        }catch(InputMismatchException i){
            System.out.println("java.util.InputMismatchException");
        }
    }
}
