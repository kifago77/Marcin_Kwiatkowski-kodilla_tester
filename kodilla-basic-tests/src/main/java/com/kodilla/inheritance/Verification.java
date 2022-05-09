package com.kodilla.inheritance;

public class Verification {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem();
        operatingSystem.turnOff();
        operatingSystem.turnOn();
        System.out.println();
        Windows windows = new Windows();
        windows.windows();
        windows.turnOff();
        windows.turnOn();
        System.out.println();
        Linux linux = new Linux();
        linux.linux();
        linux.turnOff();
        linux.turnOn();

    }
}
