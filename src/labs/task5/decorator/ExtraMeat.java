package labs.task5.decorator;
import labs.task5.Composite.Meal;

public class ExtraMeat extends MealDecorator {
    private double cost = 1;

    public ExtraMeat(Meal meal) {
        super(meal);
    }

    @Override
    public void display() {
        decoratedMeal.display();
        System.out.println(" + Extra Meat");
    }

    @Override
    public double getCost() {
        return decoratedMeal.getCost() + cost;
    }
}
