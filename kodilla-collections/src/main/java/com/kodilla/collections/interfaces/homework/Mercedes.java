package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car{
    private int speed;
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed +25;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed -15;

    }
}
