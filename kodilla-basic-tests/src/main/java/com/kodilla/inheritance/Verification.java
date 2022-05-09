package com.kodilla.inheritance;

public class Verification {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(2020);
        operatingSystem.turnOff();
        operatingSystem.turnOn();
        System.out.println();
        Windows windows = new Windows(2020);
        windows.turnOff();
        windows.turnOn();
        System.out.println();
        Linux linux = new Linux(2000);
        linux.turnOff();
        linux.turnOn();

    }
}
