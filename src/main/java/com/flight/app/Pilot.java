package com.flight.app;

/**
 * Created by bezi on 2017.05.24..
 */
public class Pilot extends Employee {
    private boolean hasCompass = false;

    public Pilot(String name, int phoneNum, String birthDate, int salary, boolean hasCompass){
        super(name, phoneNum, birthDate, salary);
        this.hasCompass = hasCompass;
    }

    public boolean isHasCompass() {
        return hasCompass;
    }

    public void setHasCompass(boolean hasCompass) {
        this.hasCompass = hasCompass;
    }
}
