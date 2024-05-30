package DesignPatterns.Behavioral.Strategy.Solution;

public class Vehicle {
    DriveStrategy ds;
    public Vehicle(DriveStrategy ds) {
        this.ds = ds;
    }

    public void drive() {
        this.ds.drive();
    }
}
