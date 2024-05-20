package DesignPatterns.Strategy.Issue;

public class Runner {
    public static void main(String[] args) {
        Vehicle v1 = new SportyVehicle();
        Vehicle v2 = new OffroadVehicle();
        Vehicle v3 = new NormalVehicle();
        v1.drive();
        v2.drive();
        v3.drive();
    }
}
