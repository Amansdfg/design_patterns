package CreationalDesignPatterns.FactoryMethod;

public class TestFactoryMethod {
    public static void main(String[] args) {
        Logistics roadlogistics=new RoadLogistics();
        roadlogistics.planDelivery();

        Logistics sealogistics=new SeaLogistics();
        sealogistics.planDelivery();
    }
}
