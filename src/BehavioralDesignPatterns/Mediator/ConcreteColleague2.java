package BehavioralDesignPatterns.Mediator;

public class ConcreteColleague2 extends Colleague {
    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague2 received: " + message);
    }

    @Override
    public void send(String message) {
        System.out.println("Colleague2 sends: " + message);
        mediator.send(message, this);
    }
}

