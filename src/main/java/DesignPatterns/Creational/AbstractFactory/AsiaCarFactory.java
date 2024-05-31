package DesignPatterns.Creational.AbstractFactory;

public class AsiaCarFactory implements CarFactory {

    public Car createCar(String s) {
        if(s.equalsIgnoreCase("SEDAN")) {
            return new Sedan();
        }
        else if(s.equalsIgnoreCase("SUV")) {
            return new Suv();
        }
        else {
            new Error("Invalid Car Type");
            return null;
        }
    }

    public CarSpecification createSpecification() {
        return new AsiaSpecification();
    }
}
