package CreationalDesignPatterns.FactoryMethod;

public class Truck implements Transport {
    @Override
    public void deliver() {
        System.out.println("Deliver be road in track");
    }
}
