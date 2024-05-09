package com.perscholas.java_basics.SBA_303_8;

public class MallParking implements ParkingSystem{
    private int time;
    private double subcharge =.10;

    MallParking(int time){
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
        return String.format("Price for Mall Parking is $%.2f",amount);
    }
}
