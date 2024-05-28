package DesignPatterns.Structural.Decorator;

public class Mushroom extends ToppingDecorator {

    BasePizzaAbstract basePizza;

    public Mushroom(BasePizzaAbstract basePizza) {
        this.basePizza = basePizza;
    }

    @Override
    public int cost() {
        return basePizza.cost() + 30;
    }
}
