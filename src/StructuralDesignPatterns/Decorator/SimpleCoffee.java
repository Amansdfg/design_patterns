package StructuralDesignPatterns.Decorator;

public class SimpleCoffee implements Coffee {

    @Override
    public String getDescription() {

        return "Simple Coffee";
    }

    @Override
    public double cost() {

        return 2;
    }
}
