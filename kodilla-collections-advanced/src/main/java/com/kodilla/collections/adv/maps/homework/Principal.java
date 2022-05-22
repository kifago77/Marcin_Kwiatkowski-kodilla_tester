package com.kodilla.collections.adv.maps.homework;

public class Principal {
    private String name;

    public Principal(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Principal:\n" +
                "name = " + name + '\n';
    }

    public String getName() {
        return name;
    }
}
