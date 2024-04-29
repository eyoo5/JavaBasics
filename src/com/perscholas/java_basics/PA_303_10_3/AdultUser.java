package com.perscholas.java_basics.PA_303_10_3;

public class AdultUser implements LibraryUser{
        private String bookType;
        private int age;


        public void setBookType(String bookType){
            this.bookType = bookType;
        }
        public void setMyAge(int age){
            this.age =age;
        }
        @Override
        public void registerAccount(){
            if(age >=12){
                System.out.println("You have successfully registered under an Adult Account.");
            }else{
                System.out.println("Sorry, age must be greater than 12 to register as an adult.");
            }
        }

        @Override
        public void requestBook() {
            if (bookType.equals("Fiction")) {
                System.out.println("Book issued successfully, please return the book within 7 days.");
            }else{
                System.out.println("Oops, you are allowed to take only adult Fiction books.");
            }

    }

}
