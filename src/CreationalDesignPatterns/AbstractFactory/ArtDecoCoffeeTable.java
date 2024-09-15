package CreationalDesignPatterns.AbstractFactory;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void placeItems() {
        System.out.println("Placing item on ArtDeco coffee table");
    }
}
