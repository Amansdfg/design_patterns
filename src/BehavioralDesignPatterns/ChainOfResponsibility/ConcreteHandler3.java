package BehavioralDesignPatterns.ChainOfResponsibility;

public class ConcreteHandler3 extends Handler {
    @Override
    public void handleRequest(String request) {
        if (request.contains("type3")) {
            System.out.println("ConcreteHandler3 handled: " + request);
        } else if (nextHandler != null) {
            nextHandler.handleRequest(request);
        } else {
            System.out.println("No handler found for: " + request);
        }
    }
}

