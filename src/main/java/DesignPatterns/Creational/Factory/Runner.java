package DesignPatterns.Creational.Factory;


public class Runner {

    /***
     * Loosens the coupling of object's construction code from the code that uses this object[client code]
     * @param args
     */
    public static void main(String[] args) {
        Shape s1 = new ShapeFactory().getShape("CIRCLE");
        Shape s2 = new ShapeFactory().getShape("RECTANGLE");
        Shape s3 = new ShapeFactory().getShape("SQUARE");
        Shape s4 = new ShapeFactory().getShape("K");
        s1.draw();
        s2.draw();
        s3.draw();
        s4.draw();
    }
}
