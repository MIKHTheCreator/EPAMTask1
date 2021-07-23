package com.epam.jwd.airline;

import com.epam.jwd.factory.AircraftFactory;
import com.epam.jwd.plane.Aircraft;

import java.util.ArrayList;
import java.util.List;

public class Airline {

    List<Aircraft> boardList;

    public Airline() {

        this.boardList = new ArrayList<>();
    }

    public void addStandardAircraftBase(AircraftFactory factory){

        for(int i = 0; i < 11; i++){
            boardList.add(factory.createPassengerAircraft());
        }

        addCargoAircraft(factory);
        boardList.add(factory.createDedicatedAircraft());
        boardList.add(factory.createTrainingAircraft());
    }

    private void addCargoAircraft(AircraftFactory factory){
        for(int i = 0; i < 4; i++){
            boardList.add(factory.createCargoAircraft());
        }
    }

    public void showAirlineBoards(){

        for(Aircraft aircraft : boardList){
            System.out.println(aircraft.getModelName());
        }
    }


}
