package com.epam.jwd.aircraft;

import java.io.Serializable;
import java.util.Objects;

public class Aircraft implements Serializable {

    private String modelName;
    private int aircraftCapacity;
    private float liftingCapacityInKilograms;
    private float fuelConsumption;
    private int rangeOfFlightInKilometers;

    public Aircraft(String modelName, int aircraftCapacity, float liftingCapacityInKilograms,
                    float fuelConsumption, int rangeOfFlightInKilometers) {
        this.modelName = modelName;
        this.aircraftCapacity = aircraftCapacity;
        this.liftingCapacityInKilograms = liftingCapacityInKilograms;
        this.fuelConsumption = fuelConsumption;
        this.rangeOfFlightInKilometers = rangeOfFlightInKilometers;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getAircraftCapacity() {
        return aircraftCapacity;
    }

    public void setAircraftCapacity(int aircraftCapacity) {
        this.aircraftCapacity = aircraftCapacity;
    }

    public float getLiftingCapacityInKilograms() {
        return liftingCapacityInKilograms;
    }

    public void setLiftingCapacityInKilograms(float liftingCapacityInKilograms) {
        this.liftingCapacityInKilograms = liftingCapacityInKilograms;
    }

    public float getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(float fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getRangeOfFlightInKilometers() {
        return rangeOfFlightInKilometers;
    }

    public void setRangeOfFlightInKilometers(int rangeOfFlightInKilometers) {
        this.rangeOfFlightInKilometers = rangeOfFlightInKilometers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CargoAircraft)) return false;
        CargoAircraft that = (CargoAircraft) o;
        return getAircraftCapacity() == that.getAircraftCapacity()
                && Float.compare(that.getLiftingCapacityInKilograms(), getLiftingCapacityInKilograms()) == 0
                && Float.compare(that.getFuelConsumption(), getFuelConsumption()) == 0
                && getRangeOfFlightInKilometers() == that.getRangeOfFlightInKilometers()
                && Objects.equals(getModelName(), that.getModelName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getModelName(), getAircraftCapacity(),
                getLiftingCapacityInKilograms(), getFuelConsumption(), getRangeOfFlightInKilometers());
    }

    @Override
    public String toString() {
        return modelName + "(" + this.getClass().getSimpleName() + "):"
                + "\nAircraft Capacity>> " + aircraftCapacity
                + "\nLifting Capacity(kg)>> " + liftingCapacityInKilograms
                + "\nFuelConsumption(kg/h)>> " + fuelConsumption
                + "\nRange Of Flight(km)>> " + rangeOfFlightInKilometers;
    }
}
