package com.perscholas.java_basics.PracticeSBA1_2_3;

public class PracticeSBAQuestions123 {
    //Practice 1 Printing


    //Practice 2 Division
    public void divideString(String s){
        int quotient = Integer.parseInt(s.substring(0,1));
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
    public void subtractString(String s){
        String [] arrS = s.split("");
        int difference = Integer.parseInt(arrS[0]);

        for(int i = 1; i < arrS.length; i++){
            int currentNum = Integer.parseInt(arrS[i]);
            difference -= currentNum;
        }
        System.out.println(difference);
    }

}
