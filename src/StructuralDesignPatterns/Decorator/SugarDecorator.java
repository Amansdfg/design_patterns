package StructuralDesignPatterns.Decorator;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }

    @Override
    public String getDescription() {
        return decoratorCoffee.getDescription() + ", Sugar";
    }
    @Override
    public double cost() {
        return decoratorCoffee.cost() + 0.2;
    }
}
