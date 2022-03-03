package com.kodilla.inheritance;

public class Application {
    public static void main(String[] args) {
        System.out.println("Klasa Samochod");
        Car car = new Car(4, 5);
        car.turnOnLight();
        car.openDoors();
        System.out.println(car.getSeats());
        System.out.println(car.getWheels());
        car.displayNumberOfSeats();


        System.out.println();

        System.out.println("Klasa Kabroiolet");
        Convertible convertible = new Convertible();
        convertible.openRoof();
        convertible.closeRoof();
        convertible.openDoors();
        System.out.println(convertible.getSeats());
        System.out.println(convertible.getWheels());
        convertible.displayNumberOfSeats();


    }
}
