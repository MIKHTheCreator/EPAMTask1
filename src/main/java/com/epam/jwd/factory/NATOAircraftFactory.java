package com.epam.jwd.factory;

import com.epam.jwd.plane.*;

public class NATOAircraftFactory implements AircraftFactory {

    @Override
    public Aircraft createShortHaulPassengerAircraft() {
        return new PassengerAircraft("Airbus 319", 119,
                2300, 1760, 2300);
    }

    @Override
    public Aircraft createMiddleHaulPassengerAircraft() {
        return new PassengerAircraft("Boeing 737-800", 235,
                4670, 3520, 5700);
    }

    @Override
    public Aircraft createLongHaulPassengerAircraft() {
        return new PassengerAircraft("Airbus A380", 853,
                14800, 14200, 15400);
    }

    @Override
    public Aircraft createMiddleHaulCargoAircraft() {
        return new CargoAircraft("C-146A Wolfhound", 3450,
                3920, 1850);
    }

    @Override
    public Aircraft createLongHaulCargoAircraft() {
        return new CargoAircraft("Lockheed C-5 Galaxy", 118317,
                15600, 10400);
    }

    @Override
    public Aircraft createTrainingAircraft() {
        return new TrainingAircraft("Raytheon T-6 Texan II",
                830, 1357);
    }

    @Override
    public Aircraft createRescueAircraft() {
        return new DedicatedAircraft("Lockheed HC-130", 7590,
                5800, 12100);
    }

    @Override
    public Aircraft createIntelligenceAircraft() {
        return new DedicatedAircraft("McDonnell Douglas KC-10 Extender", 13800,
                12100, 16700);
    }

}
