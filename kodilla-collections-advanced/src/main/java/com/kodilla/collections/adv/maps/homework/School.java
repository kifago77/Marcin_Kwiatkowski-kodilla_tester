package com.kodilla.collections.adv.maps.homework;
import java.util.ArrayList;

public class School {
    private ArrayList<Integer> numberOfPupilsInSpecificClass;
    private Principal principal;
    private String name;

    public School(String name, Principal principal, ArrayList<Integer> numberOfPupilsInSpecificClass) {
        this.name = name;
        this.principal = principal;
        this.numberOfPupilsInSpecificClass = numberOfPupilsInSpecificClass;
    }

    @Override
    public String toString() {
        return "School:\n" +
                "numberOfPupilsInSpecificClass = " + numberOfPupilsInSpecificClass +
                "\nprincipal = " + principal.getName() +
                "\nname = " + name + '\n';
    }
}
