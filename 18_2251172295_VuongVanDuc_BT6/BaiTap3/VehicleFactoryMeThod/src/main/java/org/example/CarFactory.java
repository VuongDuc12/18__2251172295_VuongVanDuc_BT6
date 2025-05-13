package org.example;

public class CarFactory extends VehicleFactory {
    @Override
    public Vehicle CreateVehicle() {
        return new Car();
    }

    @Override
    public void someOperation() {
       System.out.println("Khởi tạo Car");
       super.someOperation();
    }
}
