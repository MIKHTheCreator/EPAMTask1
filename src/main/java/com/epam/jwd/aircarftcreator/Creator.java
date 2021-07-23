package com.epam.jwd.aircarftcreator;

import com.epam.jwd.plane.Aircraft;

public class Creator {

    public Aircraft constructBoeing777(Aircraft aircraft){

        aircraft.setModelName("777-300ER (77W)");
        aircraft.setAircraftCapacity(350);
        aircraft.setLiftingCapacityInKilograms(23024);
        aircraft.setFuelConsumption(7800);
        aircraft.setRangeOfFlightInKilometers(14594);
        return aircraft;
    }

    public Aircraft constructBoeing787(Aircraft aircraft){

        aircraft.setModelName("787-9 (789)");
        aircraft.setAircraftCapacity(290);
        aircraft.setLiftingCapacityInKilograms(15100);
        aircraft.setFuelConsumption(5400);
        aircraft.setRangeOfFlightInKilometers(15372);
        return aircraft;
    }

    public Aircraft constructBoeing737(Aircraft aircraft){

        aircraft.setModelName("737 MAX 8 (7M8)");
        aircraft.setAircraftCapacity(210);
        aircraft.setLiftingCapacityInKilograms(8328);
        aircraft.setFuelConsumption(2180);
        aircraft.setRangeOfFlightInKilometers(6510);
        return  aircraft;
    }

    public Aircraft constructDehavilland400(Aircraft aircraft){
        aircraft.setModelName("Dash 8-400 (DH4)");
        aircraft.setAircraftCapacity(50);
        aircraft.setLiftingCapacityInKilograms(2136);
        aircraft.setFuelConsumption(3800);
        aircraft.setRangeOfFlightInKilometers(2522);
        return aircraft;
    }

    public Aircraft constructMitsubishi(Aircraft aircraft){
        aircraft.setModelName("CRJ200 (CRJ)");
        aircraft.setAircraftCapacity(44);
        aircraft.setLiftingCapacityInKilograms(1591);
        aircraft.setFuelConsumption(3300);
        aircraft.setRangeOfFlightInKilometers(1574);
        return aircraft;
    }

    public Aircraft constructEmbraer(Aircraft aircraft){
        aircraft.setModelName("E175 (E75)");
        aircraft.setAircraftCapacity(88);
        aircraft.setLiftingCapacityInKilograms(400);
        aircraft.setFuelConsumption(1650);
        aircraft.setRangeOfFlightInKilometers(2413);
        return aircraft;
    }
}
