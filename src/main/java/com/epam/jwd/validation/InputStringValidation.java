package com.epam.jwd.validation;

import com.epam.jwd.airline.Airline;
import com.epam.jwd.factory.AircraftFactory;
import com.epam.jwd.factory.CISAircraftFactory;
import com.epam.jwd.factory.NATOAircraftFactory;

import java.util.Locale;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InputStringValidation {

    public static String validate(Scanner scan){

        String inputString, parsedString;

        while(true){

            inputString = scan.nextLine();

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

    public static void checkStringForMatch(Airline airline, String parsedString){

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
