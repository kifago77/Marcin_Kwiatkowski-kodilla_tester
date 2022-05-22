package com.kodilla.collections.adv.exercises.homework;

import java.util.ArrayList;
import java.util.List;

public class FlightFinder {
    public List<Flight> findFlightsFrom(String departure) {
        ArrayList<Flight> flightsResult = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getDeparture().equals(departure)) {
                flightsResult.add(flight);
            }
        }
        return flightsResult;
    }

    public List<Flight> findFlightsTo(String arrival) {
        ArrayList<Flight> flightsResult = new ArrayList<>();
        for (Flight flight : FlightRepository.getFlightsTable()) {
            if (flight.getArrival().equals(arrival)) {
                flightsResult.add(flight);
            }
        }
        return flightsResult;
    }
}
