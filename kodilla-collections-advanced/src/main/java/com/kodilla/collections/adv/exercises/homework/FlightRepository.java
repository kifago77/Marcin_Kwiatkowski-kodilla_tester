package com.kodilla.collections.adv.exercises.homework;
import java.util.ArrayList;

public class FlightRepository {
    public static ArrayList<Flight> getFlightsTable() {
        ArrayList<Flight> flights = new ArrayList<>();
        flights.add(new Flight("London","Warsaw"));
        flights.add(new Flight("Warsaw","Berlin"));
        return flights;
    }
}
