package org.example;

public class Car implements Vehicle {
    private int id;
    private String name;
    private String Category;
    private String Dynamic;

    public Car() {}
    @Override
    public int GetMaxSpeed(){
        return 200;
    };
}
