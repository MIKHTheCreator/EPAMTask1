package com.epam.jwd.aircraft;

import java.util.Objects;

public class PassengerAircraft extends Aircraft {

    private int numOfEmergencyExits;

    public PassengerAircraft(String modelName, int aircraftCapacity, float liftingCapacityInKilograms,
                             float fuelConsumption, int rangeOfFlightInKilometers, int numOfEmergencyExits) {
        super(modelName, aircraftCapacity, liftingCapacityInKilograms, fuelConsumption, rangeOfFlightInKilometers);
        this.numOfEmergencyExits = numOfEmergencyExits;
    }

    public int getNumOfEmergencyExits() {
        return numOfEmergencyExits;
    }

    public void setNumOfEmergencyExits(int numOfEmergencyExits) {
        this.numOfEmergencyExits = numOfEmergencyExits;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof PassengerAircraft)) return false;
        if (!super.equals(o)) return false;
        PassengerAircraft that = (PassengerAircraft) o;
        return getNumOfEmergencyExits() == that.getNumOfEmergencyExits();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumOfEmergencyExits());
    }
}
