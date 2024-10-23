package StructuralDesignPatterns.Decorator;

abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratorCoffee;
    public CoffeeDecorator(Coffee decoratorCoffee) {
        this.decoratorCoffee = decoratorCoffee;
    }
    @Override
    public String getDescription() {

        return decoratorCoffee.getDescription();
    }

    @Override
    public double cost() {
        return decoratorCoffee.cost();

    }
}
