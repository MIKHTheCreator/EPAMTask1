package com.epam.jwd.factory;

import com.epam.jwd.aircraft.*;

public class CISAircraftFactory implements AircraftFactory {

    @Override
    public Aircraft createLongHaulPassengerAircraft() {
        return new PassengerAircraft("Boeing 747-300", 624, 13400,
                10300, 14200);
    }

    @Override
    public Aircraft createLongHaulCargoAircraft() {
        return new CargoAircraft("AH-225", 390000,
                15900, 15400);
    }

    @Override
    public Aircraft createTrainingAircraft() {
        return new TrainingAircraft("Hawker Siddeley Hawk",
                920, 2520);
    }

    @Override
    public Aircraft createIntelligenceAircraft() {
        return new DedicatedAircraft("IL-80", 0,
                8400, 10300);
    }

    @Override
    public Aircraft createMiddleHaulPassengerAircraft() {
        return new PassengerAircraft("Boeing 737-800", 225,
                4900, 3657, 4500);
    }

    @Override
    public Aircraft createShortHaulPassengerAircraft() {
        return new PassengerAircraft("Sukhoi SuperJet 100", 120, 1200,
                1240, 2400);
    }

    @Override
    public Aircraft createMiddleHaulCargoAircraft() {
        return new CargoAircraft("Аn-24", 9000,
                2470, 5700);
    }

    @Override
    public Aircraft createRescueAircraft() {
        return new DedicatedAircraft("Be-200", 12370,
                5600, 10500);
    }
}
