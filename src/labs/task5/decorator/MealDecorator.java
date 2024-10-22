package labs.task5.decorator;

import labs.task5.Composite.Meal;

// Decorator abstract class
abstract class MealDecorator implements Meal {
    protected Meal decoratedMeal;

    public MealDecorator(Meal meal) {
        this.decoratedMeal = meal;
    }

    @Override
    public void display() {
        decoratedMeal.display();
    }

    @Override
    public double getCost() {
        return decoratedMeal.getCost();
    }
}