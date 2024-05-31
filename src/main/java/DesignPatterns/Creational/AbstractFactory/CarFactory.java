package DesignPatterns.Creational.AbstractFactory;

public interface CarFactory {

    Car createCar(String s);

    CarSpecification createSpecification();

}
