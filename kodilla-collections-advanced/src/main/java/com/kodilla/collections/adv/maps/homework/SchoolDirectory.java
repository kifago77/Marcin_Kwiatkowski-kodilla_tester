package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class SchoolDirectory {
    public static void main(String[] args) {
        Random rand = new Random();
        Principal principal1 = new Principal("Marcin Kwiatkowski");
        ArrayList<Integer> numberOfPupilsInSpecificClass1 = new ArrayList<>();
        for (int i =0;i<10;i++){
            numberOfPupilsInSpecificClass1.add(10 + rand.nextInt(30));
        }
        School school1 = new School("Liceum im Jagielly",principal1,numberOfPupilsInSpecificClass1);

        Principal principal2 = new Principal("Mikolaj Kwiatkowski");
        ArrayList<Integer> numberOfPupilsInSpecificClass2= new ArrayList<>();
        for (int i =0;i<10;i++){
            numberOfPupilsInSpecificClass2.add(10 + rand.nextInt(30));
        }
        School school2 = new School("Liceum Malachowskiego",principal2,numberOfPupilsInSpecificClass2);

        Map<School,Principal> map = new HashMap<>();
        map.put(school1,principal1);
        map.put(school2,principal2);

        for(Map.Entry<School, Principal> entry : map.entrySet()) {
            System.out.println(entry.getKey().toString()+ "Number of pupils = " + entry.getKey().sumOfPupils() + "\n" + entry.getValue().toString());
        }
    }


    }

