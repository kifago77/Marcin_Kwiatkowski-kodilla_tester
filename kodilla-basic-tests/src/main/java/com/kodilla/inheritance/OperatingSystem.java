package com.kodilla.inheritance;

public class OperatingSystem {
    private int years;
    public OperatingSystem(int years){
        this.years = years;
    }



    public void turnOn(){
        System.out.println("Operating System On");
    }
    public void turnOff(){
        System.out.println("Operating System Off");
    }

}
