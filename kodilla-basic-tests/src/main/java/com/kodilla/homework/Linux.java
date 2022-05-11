package com.kodilla.homework;

import com.kodilla.homework.OperatingSystem;

public class Linux extends OperatingSystem {

    public Linux(){
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
