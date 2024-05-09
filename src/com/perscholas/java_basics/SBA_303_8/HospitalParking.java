package com.perscholas.java_basics.SBA_303_8;

public class HospitalParking implements ParkingSystem{
    private int time;
    private double subcharge =.20;

    HospitalParking(int time){
        this.time = time;
    }

    @Override
    public double processTicket(){
        double rate;

        if(time <= 12){
            rate = ParkingSystem.MORNING;
        }else if( time <= 19){
            rate = ParkingSystem.NIGHTLY;
        }else{
            rate = ParkingSystem.TWENTY_FOUR;
        }

        double subchargeAmount= rate * subcharge;
        return rate + subchargeAmount;
    }

    @Override
    public String toString(){
        double amount = processTicket();
        return String.format("Price for Hospital Parking is $%.2f",amount);
    }
}
