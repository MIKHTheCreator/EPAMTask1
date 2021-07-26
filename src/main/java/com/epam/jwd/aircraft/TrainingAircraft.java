package com.epam.jwd.aircraft;

import java.util.Objects;

public class TrainingAircraft extends Aircraft {

    private int numOfStudents;

    public TrainingAircraft(String modelName, float fuelConsumption, int rangeOfFlightInKilometers, int numOfStudents) {
        super(modelName, 0, 0, fuelConsumption, rangeOfFlightInKilometers);
        this.numOfStudents = numOfStudents;
    }

    public int getNumOfStudents() {
        return numOfStudents;
    }

    public void setNumOfStudents(int numOfStudents) {
        this.numOfStudents = numOfStudents;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TrainingAircraft)) return false;
        if (!super.equals(o)) return false;
        TrainingAircraft that = (TrainingAircraft) o;
        return getNumOfStudents() == that.getNumOfStudents();
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), getNumOfStudents());
    }
}
