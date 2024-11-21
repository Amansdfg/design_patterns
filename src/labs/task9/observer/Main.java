package labs.task9.observer;

import labs.task9.MealOrderMemento;

public class Main {
    public static void main(String[] args) {
        MealOrder mealOrder = new MealOrder();

        CustomerObserver customer1 = new CustomerObserver("Alice");
        CustomerObserver customer2 = new CustomerObserver("Bob");
        mealOrder.addObserver(customer1);
        mealOrder.addObserver(customer2);


        mealOrder.addItem("Burger", 5.99);
        mealOrder.addItem("Fries", 2.99);


        mealOrder.removeItem("Fries", 2.99);

        MealOrderMemento savedState = mealOrder.save();
        mealOrder.addItem("Drink", 1.49);
        mealOrder.restore(savedState);
    }
}
