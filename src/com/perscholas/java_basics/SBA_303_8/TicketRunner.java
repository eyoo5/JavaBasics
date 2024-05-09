package com.perscholas.java_basics.SBA_303_8;

public class TicketRunner {
    public static void main(String[] args) {
        MallParking mallObj = new MallParking(20);
        HospitalParking hospObj = new HospitalParking(20);

        System.out.println(mallObj.toString());
        System.out.println(hospObj.toString());
    }
}
