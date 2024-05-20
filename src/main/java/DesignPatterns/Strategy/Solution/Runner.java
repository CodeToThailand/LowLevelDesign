package DesignPatterns.Strategy.Solution;

public class Runner {
    public static void main(String[] args) {
        Vehicle v1 = new SportyVehicle();
        Vehicle v2 = new OffroadVehicle();
        Vehicle v3 = new NormalVehicle();
        v1.ds.drive();
        v2.ds.drive();
        v3.ds.drive();
    }
}
