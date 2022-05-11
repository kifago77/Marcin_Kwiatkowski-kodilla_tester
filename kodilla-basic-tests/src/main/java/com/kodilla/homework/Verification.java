package com.kodilla.homework;

public class Verification {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2020);
        operatingSystem.turnOff();
        operatingSystem.turnOn();
        System.out.println();
        Windows windows = new Windows();
        windows.turnOff();
        windows.turnOn();
        System.out.println();
        Linux linux = new Linux();
        linux.turnOff();
        linux.turnOn();

    }
}
