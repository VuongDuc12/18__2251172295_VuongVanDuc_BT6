package org.example;

public abstract class VehicleFactory {

    public void someOperation(){

        System.out.println("Tốc độ tối đa là "+ CreateVehicle().getMaxSpeed());
    }

    public abstract Vehicle CreateVehicle();
}
