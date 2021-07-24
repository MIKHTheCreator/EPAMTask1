package com.epam.jwd.runner;

import com.epam.jwd.airline.Airline;
import com.epam.jwd.airline_sort.AirlineSort;
import com.epam.jwd.factory.AircraftFactory;
import com.epam.jwd.factory.CISAircraftFactory;
import com.epam.jwd.factory.NATOAircraftFactory;
import com.epam.jwd.validation.InputStringValidation;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ApplicationRunner {

    /*
     * Add validation and fix some view issues
     * */
    public static void main(String[] args) {


        try (Scanner scan = new Scanner(System.in)) {

            System.out.println("Choose one company you want to create(CISAirlines/NATOAirlines), write it below:");

            String parsedString = InputStringValidation.validate(scan);
            Airline airline = new Airline();
            InputStringValidation.checkStringForMatch(airline, parsedString);
            displayAirlineInfo(airline);

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    private static void displayAirlineInfo(Airline airline) {

        System.out.println("Airline Fleet: " + airline.getBoardListSize()
                + "\nTotal Airline Capacity: " + airline.getTotalAirlineCapacity()
                + "\nTotal Airline Lifting Capacity: " + airline.getTotalAirlineLiftingCapacity()
                + "\n\nAll Available Fleet: ");
        getSortedAirlineBoards(airline);
    }

    private static void getSortedAirlineBoards(Airline airline) {

        AirlineSort.sortByFlightRange(airline.getBoardList());

        airline.getAirlineBoards();
    }
}
