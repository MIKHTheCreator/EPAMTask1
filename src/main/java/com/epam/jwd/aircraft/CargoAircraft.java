package com.epam.jwd.aircraft;

import java.util.Objects;
//
public class CargoAircraft extends Aircraft {


    private String typesOfTransportedCargo;
    public CargoAircraft(String modelName, float liftingCapacityInKilograms,
                         float fuelConsumption, int rangeOfFlightInKilometers, String typesOfTransportedCargo) {
        super(modelName, 0, liftingCapacityInKilograms, fuelConsumption, rangeOfFlightInKilometers);
        this.typesOfTransportedCargo = typesOfTransportedCargo;
    }

    public String getTypesOfTransportedCargo() {

        return typesOfTransportedCargo;
    }

    public void setTypesOfTransportedCargo(String typesOfTransportedCargo) {
        this.typesOfTransportedCargo = typesOfTransportedCargo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoAircraft)) return false;
        if (!super.equals(o)) return false;
        CargoAircraft that = (CargoAircraft) o;
        return Objects.equals(getTypesOfTransportedCargo(), that.getTypesOfTransportedCargo());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getTypesOfTransportedCargo());
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nType of transported cargo>> " + this.typesOfTransportedCargo;
    }
}
