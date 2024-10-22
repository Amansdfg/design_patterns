package labs.task5.Composite;

import java.util.ArrayList;
import java.util.List;

// Composite - Represents combo meals
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
