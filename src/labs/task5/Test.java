package labs.task5;

import labs.task5.Composite.Burger;
import labs.task5.Composite.ComboMeal;
import labs.task5.Composite.Fries;
import labs.task5.Composite.Juice;
import labs.task5.Composite.Meal;
import labs.task5.decorator.ExtraAvocado;
import labs.task5.decorator.ExtraCheese;
import labs.task5.decorator.ExtraMeat;
public class Test {
    public static void main(String[] args) {
        Meal burger = new Burger(5.0);
        Meal fries = new Fries(2.0);

        // Create a combo meal (Composite)
        ComboMeal comboMeal = new ComboMeal();
        comboMeal.addMeal(burger);
        comboMeal.addMeal(fries);

        System.out.println("Basic Combo:");
        System.out.println("Combo Meal contains:");
        comboMeal.display();
        System.out.println("Total cost: $" + comboMeal.getCost());

        // Add customizations using the Decorator pattern
        Meal customizedBurger = new ExtraCheese(burger);
        customizedBurger = new ExtraMeat(customizedBurger);

        System.out.println("\nCustomized Burger:");
        System.out.println("Combo Meal contains:");
        customizedBurger.display();
        System.out.println("Total cost: $" + customizedBurger.getCost());


        // Create a Super Combo (Composite with other combos)
        ComboMeal superCombo = new ComboMeal();
        superCombo.addMeal(comboMeal);
        superCombo.addMeal(new ExtraAvocado(new Juice(2.0)));

        System.out.println("\nSuper Combo:");
        System.out.println("Combo Meal contains:");
        superCombo.display();
        System.out.println("Total cost: $" + superCombo.getCost());
    }
}
