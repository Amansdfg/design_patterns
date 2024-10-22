package labs.task5.decorator;

import labs.task5.Composite.Meal;

public class ExtraCheese extends MealDecorator {
    private double cost = 0.5;

    public ExtraCheese(Meal meal) {
        super(meal);
    }

    @Override
    public void display() {
        decoratedMeal.display();
        System.out.println(" + Extra Cheese");
    }

    @Override
    public double getCost() {
        return decoratedMeal.getCost() + cost;
    }
}
