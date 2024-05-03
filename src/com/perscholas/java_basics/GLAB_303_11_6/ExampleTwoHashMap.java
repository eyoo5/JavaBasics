package com.perscholas.java_basics.GLAB_303_11_6;

import java.util.HashMap;

public class ExampleTwoHashMap {
    public static void main(String[] args) {
        HashMap <String, String> hm = new HashMap<>();

        hm.put("Key1", "Lenovo");
        hm.put("Key2", "Motorola");
        hm.put("Key3", "Nokia");
        hm.put("Key4", null);
        hm.put(null, "Sony");
        System.out.println("Original map contains " + hm);

        //Getting size of Map
        System.out.println("Size of original Map is: " + hm.size());

        //copy
        HashMap<String,String> hmCopy = new HashMap<>();
        hmCopy.putAll(hm);
        System.out.println("hmCopy mappings= " + hmCopy);

        //removal
        String nullKeyValue = hmCopy.remove(null);
        System.out.println("hmCopy null key value = " + nullKeyValue);
        System.out.println("hmCopy after removing null key = " + hmCopy);
        System.out.println("Size of hmCopy is:" + hmCopy.size());

    }
}
