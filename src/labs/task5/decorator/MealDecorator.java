package labs.task5.decorator;

import labs.task5.Composite.Meal;

// Decorator abstract class


/**
 * {@code Decorator}
 *
 * <blockquote><pre>Also known as: Wrapper</pre></blockquote><p>
 *  Intent
 * Decorator is a structural design pattern that lets you attach new behaviors to objects by placing these objects inside special wrapper objects that contain the behaviors.
 *
 * @author Aman
 */

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