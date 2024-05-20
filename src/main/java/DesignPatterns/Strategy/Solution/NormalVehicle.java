package DesignPatterns.Strategy.Solution;

public class NormalVehicle extends Vehicle {
    public NormalVehicle() {
        super(new NormalDriveStrategy());
    }

}
