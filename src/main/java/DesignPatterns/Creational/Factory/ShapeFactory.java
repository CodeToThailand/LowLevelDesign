package DesignPatterns.Creational.Factory;

public class ShapeFactory {

    Shape getShape(String str) {
        if(str.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        else if(str.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
        else
            return new Square();
    }
}
