package DesignPatterns.Creational.AbstractFactory;

public class CarFactoryClient {
    public static void main(String[] args) {
        CarFactory cfa = new AsiaCarFactory();
        Car c1 = cfa.createCar("suv");
        CarSpecification csa = new AsiaSpecification();
        c1.assemble();
        csa.display();


        CarFactory cfe = new EuropeCarFactory();
        Car c2 = cfa.createCar("sedan");
        CarSpecification cse = new EuropeSpecification();
        c2.assemble();
        cse.display();
    }
}
