package com.epam.jwd.factory;

import com.epam.jwd.plane.Aircraft;

public interface AirlineFactory {

    Aircraft createPassengerAircraft();
    Aircraft createCargoAircraft();
    Aircraft createTrainingAircraft();
    Aircraft createDedicatedAircraft();
}
