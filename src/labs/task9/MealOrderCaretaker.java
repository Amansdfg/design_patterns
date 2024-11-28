package labs.task9;

import java.util.Stack;

public class MealOrderCaretaker {

    private Stack<MealOrderMemento> undoStack = new Stack<>();
    private Stack<MealOrderMemento> redoStack = new Stack<>();

    public void saveState(MealOrderMemento memento) {
        undoStack.push(memento);
        redoStack.clear();
        System.out.println("State saved to undoStack. Undo stack size: " + undoStack.size());
        System.out.println("Redo stack cleared. Redo stack size: " + redoStack.size());
    }

    public MealOrderMemento undo(MealOrder currentOrder) {
        if (!undoStack.isEmpty()) {
            redoStack.push(currentOrder.save());
            System.out.println("Undo performed. Undo stack size: " + (undoStack.size() - 1));
            System.out.println("Redo stack size: " + redoStack.size());
            return undoStack.pop();
        }
        System.out.println("Undo not performed. Undo stack is empty.");
        return null;
    }

    public MealOrderMemento redo(MealOrder currentOrder) {
        if (!redoStack.isEmpty()) {
            undoStack.push(currentOrder.save());
            System.out.println("Redo performed. Redo stack size: " + (redoStack.size() - 1));
            System.out.println("Undo stack size: " + undoStack.size());
            return redoStack.pop();
        }
        System.out.println("Redo not performed. Redo stack is empty.");
        return null;
    }

}