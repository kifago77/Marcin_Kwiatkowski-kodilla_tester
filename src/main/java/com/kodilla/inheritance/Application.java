package com.kodilla.inheritance;

public class Application {

    public static void main(String[] args) {
        Car car = new Car();
        car.turnOnLight();
        car.openDoors();


        System.out.println();
        System.out.println("Class Convertible");
        Convertible convertible = new Convertible();
        convertible.openRoof();
        convertible.closeRoof();
        convertible.openDoors();

    }
}