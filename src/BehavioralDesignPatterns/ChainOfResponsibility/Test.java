package BehavioralDesignPatterns.ChainOfResponsibility;

public class Test {
    public static void main(String[] args) {
        Handler handler1 = new ConcreteHandler1();
        Handler handler2 = new ConcreteHandler2();
        Handler handler3 = new ConcreteHandler3();

        handler1.setNextHandler(handler2);
        handler2.setNextHandler(handler3);

        handler1.handleRequest("Request type1");
        handler1.handleRequest("Request type2");
        handler1.handleRequest("Request type3");
        handler1.handleRequest("Request type4");
    }
}

