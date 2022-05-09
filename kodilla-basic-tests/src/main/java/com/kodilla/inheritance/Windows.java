package com.kodilla.inheritance;

public class Windows extends OperatingSystem {
    public  Windows(int years){
        super(2020);

        System.out.println("System operacyjny Windows ON");
    }


    @Override
    public void turnOff() {

        System.out.println("System Windows OFF!!!!");
    }

    @Override
    public void turnOn() {
        System.out.println("System Windows ON!!!");
    }
}
