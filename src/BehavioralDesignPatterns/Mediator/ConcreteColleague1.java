package BehavioralDesignPatterns.Mediator;

public class ConcreteColleague1 extends Colleague {
    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void receive(String message) {
        System.out.println("Colleague1 received: " + message);
    }

    @Override
    public void send(String message) {
        System.out.println("Colleague1 sends: " + message);
        mediator.send(message, this);
    }
}

