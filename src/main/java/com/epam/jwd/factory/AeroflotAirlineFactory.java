package com.epam.jwd.factory;

import com.epam.jwd.plane.*;

import java.util.Optional;

public class AeroflotAirlineFactory implements AirlineFactory{

    @Override
    public Aircraft createPassengerAircraft() {
        return new PassengerAircraft("Boeing 747-400", 624, 13400,
                10300, 14200);
    }

    @Override
    public Aircraft createCargoAircraft() {
        return new CargoAircraft("AH-225", 390000,
                15900, 15400);
    }

    @Override
    public Aircraft createTrainingAircraft() {
        return new TrainingAircraft("Hawker Siddeley Hawk", 920, 2520);
    }

    @Override
    public Aircraft createDedicatedAircraft() {
        return new DedicatedAircraft("IL-80", 0,
                8400, 10300);
    }
}
