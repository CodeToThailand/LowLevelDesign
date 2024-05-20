package DesignPatterns.Strategy.Solution;

public class OffroadVehicle extends Vehicle {
    // Code Duplication
    public OffroadVehicle() {
        super(new SportsDriveStrategy());
    }
}
