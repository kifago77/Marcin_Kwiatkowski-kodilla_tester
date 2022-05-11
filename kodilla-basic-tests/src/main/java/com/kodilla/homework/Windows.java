package com.kodilla.homework;

import com.kodilla.homework.OperatingSystem;

public class Windows extends OperatingSystem {
    public  Windows(){
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
