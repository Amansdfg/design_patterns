package BehavioralDesignPatterns.ChainOfResponsibility;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.contains("type2")) {
            System.out.println("ConcreteHandler2 handled: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

