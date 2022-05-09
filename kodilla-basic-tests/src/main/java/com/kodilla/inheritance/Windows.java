package com.kodilla.inheritance;

public class Windows extends OperatingSystem {
    int years = 2020;
    public void windows(){
        System.out.println("System operacyjny Windows");
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
