package com.epam.jwd.plane;

public class DedicatedAircraft extends Aircraft {

    public DedicatedAircraft(String modelName, float liftingCapacityInKilograms,
                             float fuelConsumption, int rangeOfFlightInKilometers) {
        super(modelName, 0, liftingCapacityInKilograms, fuelConsumption, rangeOfFlightInKilometers);
    }
}
