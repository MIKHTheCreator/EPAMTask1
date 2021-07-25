package com.epam.jwd.factory;

import com.epam.jwd.aircraft.Aircraft;

public interface AircraftFactory {

    Aircraft createShortHaulPassengerAircraft();
    Aircraft createMiddleHaulPassengerAircraft();
    Aircraft createLongHaulPassengerAircraft();
    Aircraft createMiddleHaulCargoAircraft();
    Aircraft createLongHaulCargoAircraft();
    Aircraft createTrainingAircraft();
    Aircraft createRescueAircraft();
    Aircraft createIntelligenceAircraft();
}
