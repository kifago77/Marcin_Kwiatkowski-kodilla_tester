package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Lexus lexus = new Lexus();
        lexus.increaseSpeed();
        lexus.decreaseSpeed();
        System.out.println(lexus.getSpeed());

        Mercedes mercedes = new Mercedes();
        mercedes.decreaseSpeed();
        mercedes.increaseSpeed();
        System.out.println(mercedes.getSpeed());
        Porsche porsche = new Porsche();
        porsche.decreaseSpeed();
        porsche.increaseSpeed();
        System.out.println(porsche.getSpeed());
        doRace(mercedes);
        doRace(porsche);
        doRace(lexus);

    }
    public static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());
    }
}