package labs.task7.ChainOfResponsibility;
public class PreparationRequestHandler implements RequestHandler {
    private RequestHandler nextHandler;

    @Override
    public void setNextHandler(RequestHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void handleRequest(String request) {
        if (request.contains("crispy") || request.contains("no salt")) {
            System.out.println("Handling preparation request: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
