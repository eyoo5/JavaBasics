package com.perscholas.java_basics.PracticeSBA1_2_3;

public class PracticeSBAQuestions123 {
    //Practice 1 Printing


    //Practice 2 Division
    public void divideString(String s){
        int quotient = Integer.parseInt(s.substring(0,1));
            System.out.println();
        int length = s.length();
        int pointer = 1;

        while(pointer < length){
            int currentNum = Integer.parseInt(s.substring(pointer,pointer+1));
            quotient /= currentNum;
            pointer++;
        }
        System.out.println(quotient);
    }

    //Practice 3 Subtraction

}
