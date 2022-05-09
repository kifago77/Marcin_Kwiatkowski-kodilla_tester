package com.kodilla.inheritance;

public class Linux extends OperatingSystem{
    public void linux(){
        System.out.println("System Operacyjny Linux");
    }
    @Override
    public void turnOn() {
        System.out.println("System Linux ON");
    }

    @Override
    public void turnOff() {
        System.out.println("System Linux Off");
    }

}
