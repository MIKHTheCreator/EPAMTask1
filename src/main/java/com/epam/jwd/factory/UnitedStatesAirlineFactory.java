package com.epam.jwd.factory;

import com.epam.jwd.plane.*;

public class UnitedStatesAirlineFactory implements AirlineFactory{

    @Override
    public Aircraft createPassengerAircraft() {
        return new PassengerAircraft("Airbus A380", 853,
                14800, 14200, 15400);
    }

    @Override
    public Aircraft createCargoAircraft() {
        return new CargoAircraft("Lockheed C-5 Galaxy", 118317,
                15600, 10400);
    }

    @Override
    public Aircraft createTrainingAircraft() {
        return new TrainingAircraft("Raytheon T-6 Texan II", 830, 1357);
    }

    @Override
    public Aircraft createDedicatedAircraft() {
        return new DedicatedAircraft("McDonnell Douglas KC-10 Extender", 13800,
                12100, 16700);
    }
}
