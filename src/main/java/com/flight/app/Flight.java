package com.flight.app;

import java.util.ArrayList;

/**
 * Created by bezi on 2017.05.24..
 */
public class Flight {
    private static long flightId = 0;
    private ArrayList<Passenger> listOfPassengers = new ArrayList<Passenger>();
    private long instanceId;



    public Flight(Pilot pilot,Pilot coPilot,FlightAttendant flightAttendant, ArrayList<Passenger> passenger){
        flightId++;
        this.instanceId = flightId;
        this.listOfPassengers = passenger;
        System.out.println(listOfPassengers.get(0));

    }
}
