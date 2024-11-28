package CreationalDesignPatterns.Builder;

public class Test{
    public static void main(String[] args) {
        House house=new House.HouseBuilder("Concrete","Bricks","metal shingles").build();
        System.out.println(house);
        House house1=new House.HouseBuilder("Concrete","Bricks","Metal shingles")
                .setHasGarage(true)
                .setHasGarden(true)
                .build();
        System.out.println(house1);
    }

}
