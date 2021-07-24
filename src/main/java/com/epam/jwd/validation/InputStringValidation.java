package com.epam.jwd.validation;

import com.epam.jwd.airline.Airline;
import com.epam.jwd.factory.AircraftFactory;
import com.epam.jwd.factory.CISAircraftFactory;
import com.epam.jwd.factory.NATOAircraftFactory;
import com.epam.jwd.plane.Aircraft;

import java.util.Locale;
import java.util.Optional;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputStringValidation {

    public static String validateAirlineInput(Scanner scan) {

        String inputString, parsedString;

        while (true) {

            inputString = scan.nextLine();

            if(inputString.equalsIgnoreCase("exit")){

                System.out.println("Bye...");
                System.exit(1);
            }

            Pattern pattern = Pattern.compile("(((cis[\s\t]*airline)|(nato[\s\t]*airline))s*)",
                    Pattern.CASE_INSENSITIVE);
            Matcher matcher = pattern.matcher(inputString);

            if (matcher.find()) {
                parsedString = matcher.group();
                break;
            } else {
                System.out.println("Check entered value and repeat it again:");
            }
        }

        return parsedString;
    }

    public static void validateFuelParameters(Scanner scan, Airline airline){

        float minFuelConsumption = 0f;
        float maxFuelConsumption = 0f;

        minFuelConsumption = scan.nextFloat();
        maxFuelConsumption = scan.nextFloat();

            if(minFuelConsumption != 0 && maxFuelConsumption != 0f){
                System.out.println(airline.findByParameters(minFuelConsumption, maxFuelConsumption));

            } else{
                System.out.println("There is no aircraft with such fuel consumption parameters");
            }

    }

    public static void checkStringForMatch(Airline airline, String parsedString) {

        parsedString = parsedString.replaceAll("[\s\t]+", "");
        if (parsedString.equalsIgnoreCase("CISAirlines")
                || parsedString.replaceAll("[\s\t]+", "")
                .equalsIgnoreCase("CISAirline")) {
            System.out.println("\n=======" + parsedString.toUpperCase(Locale.ROOT) + "=======");

            AircraftFactory factory = new CISAircraftFactory();
            airline.addStandardAircraftBase(factory);

        } else if (parsedString.replaceAll("\\s+", "").equalsIgnoreCase("NatoAirlines")
                || parsedString.replaceAll("\\s+", "")
                .equalsIgnoreCase("NatoAirline")) {

            System.out.println("\n=======" + parsedString.toUpperCase(Locale.ROOT) + "=======");

            AircraftFactory factory = new NATOAircraftFactory();
            airline.addStandardAircraftBase(factory);
        }
    }
}
