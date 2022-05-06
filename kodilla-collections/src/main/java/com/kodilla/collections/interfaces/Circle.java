package com.kodilla.collections.interfaces;

public class Circle implements Shape {
     private double radius;

    public Circle(){
        this.radius = 7;
    }

    public double getArea(){
        return Math.PI * radius * radius;

    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }


}
