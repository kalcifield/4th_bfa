package com.flight.app;

/**
 * Created by bezi on 2017.05.24..
 */
public class FlightAttendant extends Employee {
    private int numberOfLanguagesSpoken = 0;

    public FlightAttendant(String name, int phoneNum, String birthDate, int salary, int lang){
        super(name, phoneNum, birthDate, salary);
        this.numberOfLanguagesSpoken = lang;
    }
}
