package labs.task7;

import labs.task7.Iterator.MealIterator;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Meal {

    private Map<String, Integer> items = new HashMap<>();
    private double discount = 0.0;


    public void addItem(String item) {
        items.put(item, items.getOrDefault(item, 0) + 1);
        System.out.println("Added " + item + " to the meal.");
    }


    public void removeItem(String item) {
        if (items.containsKey(item)) {
            items.remove(item);
            System.out.println("Removed " + item + " from the meal.");
        } else {
            System.out.println(item + " not found in the meal.");
        }
    }


    public void adjustPortion(String item, int portion) {
        if (items.containsKey(item)) {
            items.put(item, portion);
            System.out.println("Adjusted portion of " + item + " to " + portion + ".");
        } else {
            System.out.println(item + " not found in the meal. Add it first to adjust its portion.");
        }
    }


    public int getPortion(String item) {
        return items.getOrDefault(item, 0);
    }


    public void applyDiscount(double discount) {
        this.discount = discount;
        System.out.println("Applied a discount of " + (discount * 100) + "% to the meal.");
    }


    public void removeDiscount(double discount) {
        if (this.discount == discount) {
            this.discount = 0.0;
            System.out.println("Removed the discount from the meal.");
        } else {
            System.out.println("No matching discount to remove.");
        }
    }


    public void displayOrder() {
        System.out.println("Current Meal Order:");
        for (Map.Entry<String, Integer> entry : items.entrySet()) {
            System.out.println("- " + entry.getKey() + ": Portion " + entry.getValue());
        }
        if (discount > 0.0) {
            System.out.println("Discount applied: " + (discount * 100) + "%");
        }
    }
    public MealIterator getIterator() {
        return new MealItemIterator();
    }
    private class MealItemIterator implements MealIterator {
        private Iterator<Map.Entry<String, Integer>> iterator = items.entrySet().iterator();

        @Override
        public boolean hasNext() {
            return iterator.hasNext();
        }

        @Override
        public String next() {
            Map.Entry<String, Integer> entry = iterator.next();
            return entry.getKey() + ": Portion " + entry.getValue();
        }
    }
}

