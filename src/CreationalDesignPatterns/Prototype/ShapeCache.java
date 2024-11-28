package CreationalDesignPatterns.Prototype;

import java.util.HashMap;

public class ShapeCache {
    private static HashMap<String, Shape> shapes=new HashMap<>();
    public static Shape getShape(String id) {
        Shape cachedShape = shapes.get(id);
        return (Shape) cachedShape.clone();
    }
    public static void loadCache(){
        Circle circle=new Circle();
        circle.setId("1");
        shapes.put(circle.getId(),circle);

        Rectangle rectangle=new Rectangle();
        rectangle.setId("2");
        shapes.put(rectangle.getId(),rectangle);
    }
}
