package com.perscholas.java_basics.PA_303_10_3;

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        //Kid User
        KidUser kid1 = new KidUser();

        //Kid example where age is valid
        kid1.setAge(10);
        kid1.registerAccount();

        //Kid example where bookType is valid
        kid1.setBookType("Kids");
        kid1.requestBook();

        //Kid example where bookType is not valid
        kid1.setBookType("Fiction");
        kid1.requestBook();

        //Kid example where age and bookType is invalid
        kid1.setAge(18);
        kid1.registerAccount();

        //Adult User
        AdultUser adult1 = new AdultUser();
        //Adult with invalid age
        adult1.setMyAge(5);
        adult1.registerAccount();

        //Adult with valid age
        adult1.setMyAge(23);
        adult1.registerAccount();

        //Adult with invalid book
        adult1.setBookType("Kids");
        adult1.requestBook();

        //Adult with valid book
        adult1.setBookType("Fiction");
        adult1.requestBook();



    }
}
