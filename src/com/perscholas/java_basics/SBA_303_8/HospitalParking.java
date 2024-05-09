package com.perscholas.java_basics.SBA_303_8;

public class HospitalParking implements ParkingSystem{
    private int time;
    private double subcharge =.20;

    HospitalParking(int time){
        this.time = time;
    }

    @Override
    public double processTicket(){
        double subchargeAmount= time * subcharge;
        return time + subchargeAmount;
    }

    @Override
    public String toString(){
        double amount = processTicket();
        return String.format("Price for Hospital Parking is $%.2f",amount);
    }
}
