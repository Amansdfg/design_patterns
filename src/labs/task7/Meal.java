package labs.task7;

import java.util.HashMap;
import java.util.Map;

public class Meal {
    // Stores items and their portion sizes
    private Map<String, Integer> items = new HashMap<>();
    private double discount = 0.0;

    // Adds an item to the meal, with a default portion size of 1
    public void addItem(String item) {
        items.put(item, items.getOrDefault(item, 0) + 1);
        System.out.println("Added " + item + " to the meal.");
    }

    // Removes an item from the meal
    public void removeItem(String item) {
        if (items.containsKey(item)) {
            items.remove(item);
            System.out.println("Removed " + item + " from the meal.");
        } else {
            System.out.println(item + " not found in the meal.");
        }
    }

    // Adjusts the portion size of a specific item
    public void adjustPortion(String item, int portion) {
        if (items.containsKey(item)) {
            items.put(item, portion);
            System.out.println("Adjusted portion of " + item + " to " + portion + ".");
        } else {
            System.out.println(item + " not found in the meal. Add it first to adjust its portion.");
        }
    }

    // Gets the current portion size of an item
    public int getPortion(String item) {
        return items.getOrDefault(item, 0);
    }

    // Applies a discount to the meal
    public void applyDiscount(double discount) {
        this.discount = discount;
        System.out.println("Applied a discount of " + (discount * 100) + "% to the meal.");
    }

    // Removes the applied discount
    public void removeDiscount(double discount) {
        if (this.discount == discount) {
            this.discount = 0.0;
            System.out.println("Removed the discount from the meal.");
        } else {
            System.out.println("No matching discount to remove.");
        }
    }

    // Displays the current items, portions, and any applied discount
    public void displayOrder() {
        System.out.println("Current Meal Order:");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("- " + entry.getKey() + ": Portion " + entry.getValue());
        }
        if (discount > 0.0) {
            System.out.println("Discount applied: " + (discount * 100) + "%");
        }
    }
}

