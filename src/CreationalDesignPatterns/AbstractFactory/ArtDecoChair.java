package CreationalDesignPatterns.AbstractFactory;

public class ArtDecoChair implements Chair{
    @Override
    public void sitOn() {
        System.out.println("Sitting on a ArtDeco chair");
    }
}
