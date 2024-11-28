package labs.task5.Composite;

import java.util.ArrayList;
import java.util.List;

// Composite - Represents combo meals


/**
 *
 *{@code Composite}
 * <blockquote><pre>Also known as: Object tree</pre></blockquote><p>
 *  Intent
 * Composite is a structural design pattern that lets you compose objects into tree structures and then work with these structures as if they were individual objects.
 *
 *@author  Aman
 */

public class ComboMeal implements Meal {
    private List<Meal> meals = new ArrayList<>();

    public void addMeal(Meal meal) {
        meals.add(meal);
    }

    @Override
    public void display() {
        for (Meal meal : meals) {
            meal.display();
        }
    }

    @Override
    public double getCost() {
        double totalCost = 0;
        for (Meal meal : meals) {
            totalCost += meal.getCost();
        }
        return totalCost;
    }
}
