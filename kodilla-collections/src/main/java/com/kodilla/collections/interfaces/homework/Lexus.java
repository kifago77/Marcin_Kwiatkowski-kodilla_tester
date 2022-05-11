package com.kodilla.collections.interfaces.homework;

public class Lexus implements Car{
    private int speed ;
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 10;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 20;

    }
}
