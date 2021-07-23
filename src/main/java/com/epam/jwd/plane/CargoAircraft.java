package com.epam.jwd.plane;

public class CargoAircraft extends Aircraft {

    public CargoAircraft(String modelName, float liftingCapacityInKilograms,
                         float fuelConsumption, int rangeOfFlightInKilometers) {
        super(modelName, 0, liftingCapacityInKilograms, fuelConsumption, rangeOfFlightInKilometers);
    }
}
