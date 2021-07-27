package com.epam.jwd.aircraft;

import java.util.Objects;

public class TrainingAircraft extends Aircraft {

    private int numOfStudents;

    public TrainingAircraft(String modelName, int aircraftCapacity, float fuelConsumption, int rangeOfFlightInKilometers, int numOfStudents) {
        super(modelName, aircraftCapacity, 0, fuelConsumption, rangeOfFlightInKilometers);
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

    @Override
    public String toString() {
        return super.toString()
                + "\nNumber of students>> " + this.numOfStudents;
    }
}
