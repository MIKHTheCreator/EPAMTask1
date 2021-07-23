package com.epam.jwd.airline_sort;

import com.epam.jwd.plane.Aircraft;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AirlineSort {

    public static void sortByFlightRange(List<Aircraft> list){

        Comparator<Aircraft> comparator =
                (Aircraft aircraft1, Aircraft aircraft2) ->
                        aircraft1.getRangeOfFlightInKilometers() - aircraft2.getRangeOfFlightInKilometers();

        Collections.sort(list, comparator);
    }
}
