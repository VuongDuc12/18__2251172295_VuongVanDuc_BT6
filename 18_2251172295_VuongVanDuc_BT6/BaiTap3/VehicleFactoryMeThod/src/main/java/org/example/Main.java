package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("_____Factory method main____");

        VehicleFactory CarFactory = new CarFactory();
        VehicleFactory BicycleFactory = new BicycleFactory();
        CarFactory.someOperation();
        BicycleFactory.someOperation();

    }
}