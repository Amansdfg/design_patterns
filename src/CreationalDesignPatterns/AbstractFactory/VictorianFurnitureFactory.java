package CreationalDesignPatterns.AbstractFactory;

public class VictorianFurnitureFactory implements FurnitureFactory {
    public Chair createChair(){
        return new VictorianChair();
    }
    public Sofa createSofa(){
        return new VictorianSofa();
    }
    public CoffeeTable createCoffeeTable(){
        return new VictorianCoffeeTable();
    }

}
