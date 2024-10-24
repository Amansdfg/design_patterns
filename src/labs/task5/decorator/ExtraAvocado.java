package labs.task5.decorator;

import labs.task5.Composite.Meal;

public class ExtraAvocado extends MealDecorator{
    private double cost=1.5;

    public ExtraAvocado(Meal meal) {
        super(meal);
    }

    @Override
    public double getCost() {
        return cost;
    }

    @Override
    public void display(){
        super.display();

        System.out.println("+ Extra Avocado");
    }
}
