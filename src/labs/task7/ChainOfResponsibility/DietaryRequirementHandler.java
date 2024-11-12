package labs.task7.ChainOfResponsibility;

public class DietaryRequirementHandler implements RequestHandler {
    private RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.contains("allergy") || request.contains("diet")) {
            System.out.println("Handling dietary requirements: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}