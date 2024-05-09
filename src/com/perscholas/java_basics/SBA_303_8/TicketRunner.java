package com.perscholas.java_basics.SBA_303_8;

public class TicketRunner {
    public static void main(String[] args) {
        MallParking mallObj = new MallParking(0);
        HospitalParking hospObj = new HospitalParking(0);

        System.out.println(mallObj.toString());
        System.out.println(hospObj.toString());
    }
}
