package com.epam.jwd.airline;

import com.epam.jwd.factory.AircraftFactory;
import com.epam.jwd.plane.Aircraft;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Airline {

    List<Aircraft> boardList;

    public Airline() {

        this.boardList = new ArrayList<>();
    }

    public void addStandardAircraftBase(AircraftFactory factory){

        addPassengerAircraft(factory);
        addCargoAircraft(factory);
        addDedicatedAircraft(factory);

    }

    public void addPassengerAircraft(AircraftFactory factory){

        for(int i = 0; i < 7; i++){
            boardList.add(factory.createMiddleHaulPassengerAircraft());
            boardList.add(factory.createShortHaulPassengerAircraft());
        }

        for(int i = 0; i < 12; i++){
            boardList.add(factory.createLongHaulPassengerAircraft());
        }
    }

    private void addCargoAircraft(AircraftFactory factory){

        for(int i = 0; i < 2; i++){
            boardList.add(factory.createMiddleHaulCargoAircraft());
            boardList.add(factory.createLongHaulCargoAircraft());
        }
    }

    private void addDedicatedAircraft(AircraftFactory factory){
        boardList.add(factory.createIntelligenceAircraft());
        boardList.add(factory.createRescueAircraft());
    }

    public void showAirlineBoards(){

        for(Aircraft aircraft : boardList){
            System.out.println(aircraft.getModelName());
        }
    }

    public int getBoardListSize(){

        return this.boardList.size();
    }

    public int getTotalAirlineCapacity(){

        int totalNumOfSeats = 0;

        for(Aircraft aircraft : boardList){
            totalNumOfSeats += aircraft.getAircraftCapacity();
        }

        return totalNumOfSeats;
    }

    public int getTotalAirlineLiftingCapacity(){

        int totalLiftingCapacityInKilograms = 0;

        for(Aircraft aircraft : boardList){
            totalLiftingCapacityInKilograms += aircraft.getLiftingCapacityInKilograms();
        }

        return totalLiftingCapacityInKilograms;
    }

    public Aircraft findByParameters(float minFuelConsumption, float maxFuelConsumption){

        Optional<Aircraft> firstSuitableAircraft =  boardList.stream()
                .filter(aircraft -> (aircraft.getFuelConsumption() >= minFuelConsumption
                && aircraft.getFuelConsumption() <= maxFuelConsumption)).findFirst();

        return firstSuitableAircraft.get();
    }
}
