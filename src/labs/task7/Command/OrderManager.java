package labs.task7.Command;

import java.util.Stack;

public class OrderManager {
    private Stack<Command> commandStack = new Stack<>();
    private Stack<Command> redoStack = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        commandStack.push(command);
        redoStack.clear(); // Clear redo stack on new command
    }

    public void undo() {
        if (!commandStack.isEmpty()) {
            Command command = commandStack.pop();
            command.undo();
            redoStack.push(command);
        }
    }

    public void redo() {
        if (!redoStack.isEmpty()) {
            Command command = redoStack.pop();
            command.execute();
            commandStack.push(command);
        }
    }
}

