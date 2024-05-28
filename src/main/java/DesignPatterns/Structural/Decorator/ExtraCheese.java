package DesignPatterns.Structural.Decorator;

public class ExtraCheese extends ToppingDecorator {

    BasePizzaAbstract basePizza;

    public ExtraCheese(BasePizzaAbstract basePizza) {
        this.basePizza = basePizza;
    }

    public int cost() {
        return basePizza.cost() + 10;
    }
}
