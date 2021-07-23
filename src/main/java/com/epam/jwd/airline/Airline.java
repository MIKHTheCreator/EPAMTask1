package com.epam.jwd.airline;

import com.epam.jwd.factory.AirlineFactory;
import com.epam.jwd.plane.Aircraft;

import java.awt.event.HierarchyBoundsAdapter;
import java.util.ArrayList;
import java.util.List;

public class Airline {

    List<Aircraft> boardList;

    public Airline() {

        boardList = new ArrayList<>();
    }


    /*FIX*/
    public void addStandardAircraftBase(AirlineFactory factory){

        for(int i = 0; i < 11; i++){
            boardList.add(factory.createPassengerAircraft());
        }

        addCargoAircraft(factory);
        boardList.add(factory.createDedicatedAircraft());
        boardList.add(factory.createTrainingAircraft());
    }

    private void addCargoAircraft(AirlineFactory factory){
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
