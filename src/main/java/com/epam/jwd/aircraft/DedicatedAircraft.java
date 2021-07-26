package com.epam.jwd.aircraft;

import java.util.Objects;

public class DedicatedAircraft extends Aircraft {

    private String specialTask;

    public DedicatedAircraft(String modelName, float liftingCapacityInKilograms,
                             float fuelConsumption, int rangeOfFlightInKilometers, String specialTask) {
        super(modelName, 0, liftingCapacityInKilograms, fuelConsumption, rangeOfFlightInKilometers);
        this.specialTask = specialTask;
    }

    public String getSpecialTask() {
        return specialTask;
    }

    public void setSpecialTask(String specialTask) {
        this.specialTask = specialTask;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof DedicatedAircraft)) return false;
        if (!super.equals(o)) return false;
        DedicatedAircraft that = (DedicatedAircraft) o;
        return Objects.equals(getSpecialTask(), that.getSpecialTask());
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getSpecialTask());
    }
}
