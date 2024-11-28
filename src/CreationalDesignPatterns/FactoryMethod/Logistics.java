package CreationalDesignPatterns.FactoryMethod;

public abstract class Logistics {
    public String planDelivery(){
        Transport transport=createTransport();
        transport.deliver();
        return "delivery is planned";
    }
    public abstract Transport createTransport();
}
