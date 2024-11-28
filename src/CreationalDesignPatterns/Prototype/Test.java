package CreationalDesignPatterns.Prototype;

public class Test {
    public static void main(String[] args) {
        ShapeCache.loadCache();

        Shape s1=ShapeCache.getShape("1");
        System.out.println("Shape: " +s1.getType());
        s1.draw();

        Shape s2=ShapeCache.getShape("2");
        System.out.println("Shape: " +s2.getType());
        s2.draw();
    }
}
