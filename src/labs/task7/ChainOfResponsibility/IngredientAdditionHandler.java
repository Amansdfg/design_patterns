package labs.task7.ChainOfResponsibility;


public class IngredientAdditionHandler implements RequestHandler {
    private RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.contains("extra")) {
            System.out.println("Adding extra ingredients: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
