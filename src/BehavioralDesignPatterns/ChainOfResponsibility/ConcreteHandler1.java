package BehavioralDesignPatterns.ChainOfResponsibility;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.contains("type1")) {
            System.out.println("ConcreteHandler1 handled: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}

