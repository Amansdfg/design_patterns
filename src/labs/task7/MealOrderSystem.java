package labs.task7;


import labs.task7.ChainOfResponsibility.RequestHandler;
import labs.task7.ChainOfResponsibility.RequestHandlerChain;
import labs.task7.Command.AddItemCommand;
import labs.task7.Command.Command;
import labs.task7.Command.OrderManager;
import labs.task7.Command.RemoveItemCommand;

public class MealOrderSystem {
    public static void main(String[] args) {
        // Chain of Responsibility
        RequestHandler handlerChain = RequestHandlerChain.createChain();
        handlerChain.handleRequest("I have an allergy");
        handlerChain.handleRequest("Add extra cheese");
        handlerChain.handleRequest("Make it extra crispy");

        // Command Pattern
        Meal myMeal = new Meal();
        OrderManager orderManager = new OrderManager();

        Command addCheese = new AddItemCommand(myMeal, "Cheese");
        Command removeSalad = new RemoveItemCommand(myMeal, "Salad");

        orderManager.executeCommand(addCheese);
        orderManager.executeCommand(removeSalad);

        // Undo and redo actions
        orderManager.undo();
        orderManager.redo();

        // Display final meal order
        myMeal.displayOrder();
    }
}
