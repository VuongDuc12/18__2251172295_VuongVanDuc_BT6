package org.example;

public class Bicycle implements Vehicle {
    private int id;
    private String name;
    private String Category;
    private String Status;

    public Bicycle() {}

    @Override
    public int GetMaxSpeed(){
        return 30;
    };
}