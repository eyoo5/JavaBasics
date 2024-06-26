package com.perscholas.java_basics.PA_303_12_1;

import java.util.Scanner;
//HackerRank Question Answer:

public class JavaExceptionHandling {


        static class MyCalculator {
            public long power (int n, int p)throws Exception{
                if(n < 0 || p < 0){
                    throw new Exception("n or p should not be negative.");
                }else if (n == 0 && p == 0){
                    throw new Exception("n and p should not be zero.");
                }else{
                    return (long)Math.pow(n,p);
                }
            }
        }

        public static void main(String[] args){
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

            Scanner input = new Scanner(System.in);
            MyCalculator myCalculator = new MyCalculator();

            while(input.hasNext()){
                int n = input.nextInt();
                int p = input.nextInt();

                try{
                    System.out.println(myCalculator.power(n,p));
                }catch(Exception e){
                    System.out.println(e);
                }

            }


        }

}
