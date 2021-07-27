package com.epam.jwd.aircraft_sort;

import com.epam.jwd.aircraft.Aircraft;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AircraftSort {

    public static List<? extends Aircraft> sortByFlightRange(List<? extends Aircraft> list){

        Comparator<Aircraft> comparator =
                (Aircraft aircraft1, Aircraft aircraft2) ->
                        aircraft1.getRangeOfFlightInKilometers() - aircraft2.getRangeOfFlightInKilometers();

        Collections.sort(list, comparator);

        return list;
    }
}
