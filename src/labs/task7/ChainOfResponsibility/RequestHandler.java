package labs.task7.ChainOfResponsibility;

public interface RequestHandler {
    void setNextHandler(RequestHandler nextHandler);
    void handleRequest(String request);
}
