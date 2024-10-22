package StructuralDesignPatterns.Decorator;

public class MilkDecorator extends CoffeeDecorator{

    public MilkDecorator(Coffee decoratorCoffee) {
        super(decoratorCoffee);
    }
    @Override
    public String getDescription() {
        return decoratorCoffee.getDescription() + ", Milk";
    }
    @Override
    public double cost() {
        return decoratorCoffee.cost() + 0.5;
    }
}
