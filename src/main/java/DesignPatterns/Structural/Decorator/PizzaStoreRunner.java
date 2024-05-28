package DesignPatterns.Structural.Decorator;

public class PizzaStoreRunner {
    /***
     * Decorator design pattern is used to avoid Class Explosion since creating classes for all permutations would make
     * management of classes very difficult. E.g. - Car, Coffee, Pizza
     * @param args
     */
    public static void main(String[] args) {
        BasePizzaAbstract m = new Margherita();
        System.out.println("Margherita: " + m.cost());

        BasePizzaAbstract mec = new ExtraCheese(m);
        System.out.println("Margherita and Extra Cheese: " + mec.cost());

        BasePizzaAbstract mecm = new Mushroom(mec);
        System.out.println("Margherita and Extra Cheese and Mushroom: " + mecm.cost());

        BasePizzaAbstract mecmmec = new ExtraCheese(mecm);
        System.out.println("Margherita and Extra Cheese and Mushroom and Extra Cheese: " + mecmmec.cost());

    }
}
