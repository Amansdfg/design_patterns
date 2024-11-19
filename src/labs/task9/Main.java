package labs.task9;

public class Main {
    public static void main(String[] args) {
        MealOrder mealOrder = new MealOrder();
        MealOrderCaretaker caretaker = new MealOrderCaretaker();

        // Add items and save states
        mealOrder.addItem("Burger", 5.99);
        caretaker.saveState(mealOrder.save());
        System.out.println("Saved State 1: Burger");

        mealOrder.addItem("Fries", 2.99);
        caretaker.saveState(mealOrder.save());
        System.out.println("Saved State 2: Burger, Fries");

        mealOrder.addItem("Drink", 1.49);
        caretaker.saveState(mealOrder.save());
        System.out.println("Saved State 3: Burger, Fries, Drink");

        System.out.println("\nCurrent Order:");
        mealOrder.displayOrder();

        // Undo last change
        MealOrderMemento undoMemento = caretaker.undo(mealOrder);
        if (undoMemento != null) {
            mealOrder.restore(undoMemento);
        }
        System.out.println("\nAfter Undo:");
        mealOrder.displayOrder();

        // Redo last change
        MealOrderMemento redoMemento = caretaker.redo(mealOrder);
        if (redoMemento != null) {
            mealOrder.restore(redoMemento);
        }
        System.out.println("\nAfter Redo:");
        mealOrder.displayOrder();
    }
}
