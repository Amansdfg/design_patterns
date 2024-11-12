package labs.task7.Mediator;

import labs.task7.Command.Command;

public interface Mediator {
    void executeCommand(Command command);
    void undoCommand();
    void redoCommand();
    void displayOrder();
}
