package com.epam.jwd.factory;

import com.epam.jwd.aircraft.Aircraft;
import com.epam.jwd.aircraft.PassengerAircraft;
import com.epam.jwd.aircraft.DedicatedAircraft;
import com.epam.jwd.aircraft.CargoAircraft;
import com.epam.jwd.aircraft.TrainingAircraft;

public class CISAircraftFactory implements AircraftFactory {

    @Override
    public Aircraft createLongHaulPassengerAircraft() {
        return new PassengerAircraft("Boeing 747-300", 624, 13400,
                10300, 14200, 8);
    }

    @Override
    public Aircraft createLongHaulCargoAircraft() {
        return new CargoAircraft("AH-225", 120, 390000,
                15900, 15400, "Mail");
    }

    @Override
    public Aircraft createTrainingAircraft() {
        return new TrainingAircraft("Hawker Siddeley Hawk", 2,
                920, 2520, 1);
    }

    @Override
    public Aircraft createIntelligenceAircraft() {
        return new DedicatedAircraft("IL-80", 80, 12890,
                8400, 10300, "Intelligence");
    }

    @Override
    public Aircraft createMiddleHaulPassengerAircraft() {
        return new PassengerAircraft("Boeing 737-800", 225,
                4900, 3657, 4500, 10);
    }

    @Override
    public Aircraft createShortHaulPassengerAircraft() {
        return new PassengerAircraft("Sukhoi SuperJet 100", 120, 1200,
                1240, 2400, 4);
    }

    @Override
    public Aircraft createMiddleHaulCargoAircraft() {
        return new CargoAircraft("Аn-24", 60, 9000,
                2470, 5700, "Glass");
    }

    @Override
    public Aircraft createRescueAircraft() {
        return new DedicatedAircraft("Be-200", 130 ,12370,
                5600, 10500, "Rescue people");
    }
}
