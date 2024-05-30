package DesignPatterns.Behavioral.Strategy.Issue;

public class OffroadVehicle extends Vehicle{
    // Code Duplication (Same method is being used by multiple child classes at the same level)
    // Code duplication could be avoided by using Strategy Design Pattern
    public static void drive() {
        System.out.println("special drive");
    }
}
