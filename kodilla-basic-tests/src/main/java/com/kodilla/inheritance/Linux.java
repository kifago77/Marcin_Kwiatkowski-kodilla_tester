package com.kodilla.inheritance;

public class Linux extends OperatingSystem{

    public Linux(int years){
        super(2000);
        System.out.println("System Operacyjny Linux OFF");
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
