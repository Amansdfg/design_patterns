package BehavioralDesignPatterns.Observer;

public class Test {
    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();

        Observer observer1 = new ConcreteObserver("Observer1");
        Observer observer2 = new ConcreteObserver("Observer2");

        subject.attach(observer1);
        subject.attach(observer2);

        subject.setState("State1");
        subject.setState("State2");

        subject.detach(observer1);
        subject.setState("State3");
    }
}

