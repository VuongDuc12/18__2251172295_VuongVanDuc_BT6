package org.example;

public class BicycleFactory extends VehicleFactory {
    @Override
    public Vehicle CreateVehicle() {
        return new Bicycle();
    }

    @Override
    public void someOperation() {
        System.out.println("Khởi tạo Bicycle");
        super.someOperation();
    }
}
