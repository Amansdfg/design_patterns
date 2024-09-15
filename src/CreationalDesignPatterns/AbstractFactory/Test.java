package CreationalDesignPatterns.AbstractFactory;

public class Test {
    public static void main(String[] args) {
        FurnitureFactory artDecofurnitureFactory=new ArtDecoFurnitureFactory();
        FurnitureShop artDecofurnitureShop=new FurnitureShop(artDecofurnitureFactory);
        artDecofurnitureShop.fishRoom();

        FurnitureFactory modernFurnitureFactory=new ModernFurnitureFactory();
        FurnitureShop modernFurnitureShop=new FurnitureShop(modernFurnitureFactory);
        modernFurnitureShop.fishRoom();

        FurnitureFactory victorianFurnitureFactory=new VictorianFurnitureFactory();
        FurnitureShop victorianFurnitureShop=new FurnitureShop(victorianFurnitureFactory);
        victorianFurnitureShop.fishRoom();

    }
}
