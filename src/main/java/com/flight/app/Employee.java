package com.flight.app;

/**
 * Created by bezi on 2017.05.24..
 */
public abstract class Employee {
    private String name;
    private int phoneNum;
    private String birthDate;
    private int salary;


    public Employee(String name, int phoneNum, String birthDate, int salary){
        System.out.println("employee");
        this.name = name;
        this.phoneNum = phoneNum;
        this.birthDate = birthDate;
        this.salary = salary;
    }
}
