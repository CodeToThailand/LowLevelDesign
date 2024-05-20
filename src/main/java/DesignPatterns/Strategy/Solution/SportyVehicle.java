package DesignPatterns.Strategy.Solution;

public class SportyVehicle extends Vehicle {
    public SportyVehicle() {
        super(new SportsDriveStrategy());
    }
}
