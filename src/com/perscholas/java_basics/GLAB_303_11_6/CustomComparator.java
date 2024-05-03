package com.perscholas.java_basics.GLAB_303_11_6;

import java.util.Comparator;

public class CustomComparator implements Comparator <String> {
    @Override
    public int compare(String num1, String num2) {
        int value = num1.compareTo(num2);

        //elements are sorted in reverse order
        if (value > 0) {
            return -1;
        } else if (value < 0) {
            return 1;
        }else{
            return 0;
        }
    }

}
