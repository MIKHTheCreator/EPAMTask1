package com.epam.jwd.aircraft;

public class PassengerAircraft extends Aircraft {

    public PassengerAircraft(String modelName, int aircraftCapacity, float liftingCapacityInKilograms,
                             float fuelConsumption, int rangeOfFlightInKilometers) {
        super(modelName, aircraftCapacity, liftingCapacityInKilograms, fuelConsumption, rangeOfFlightInKilometers);
    }
}
