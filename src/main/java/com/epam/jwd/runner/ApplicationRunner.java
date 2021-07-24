package com.epam.jwd.runner;

import com.epam.jwd.airline.Airline;
import com.epam.jwd.airline_sort.AirlineSort;
import com.epam.jwd.factory.AircraftFactory;
import com.epam.jwd.factory.CISAircraftFactory;
import com.epam.jwd.factory.NATOAircraftFactory;

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

            String inputString;
            String parsedString = "";

            while(true){

                inputString = scan.nextLine();

                Pattern pattern = Pattern.compile("(cisairline|natoairline)s*", Pattern.CASE_INSENSITIVE);
                Matcher matcher = pattern.matcher(inputString);


                if (matcher.find()) {
                    parsedString = matcher.group();
                    break;
                } else {
                    System.out.println("Check entered value and repeat it again:");
                }
            }


            if (parsedString.equalsIgnoreCase("CISAirlines")) {
                System.out.println("=======" + parsedString.toUpperCase(Locale.ROOT) + "=======");

                AircraftFactory factory = new CISAircraftFactory();

                Airline airline = new Airline();
                airline.addStandardAircraftBase(factory);

                displayAirlineInfo(airline);
            } else if (parsedString.equalsIgnoreCase("NatoAirlines")) {
                System.out.println("\n=======" + parsedString.toUpperCase(Locale.ROOT) + "=======");

                AircraftFactory factory = new NATOAircraftFactory();

                Airline airline = new Airline();
                airline.addStandardAircraftBase(factory);

                displayAirlineInfo(airline);
            }
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
