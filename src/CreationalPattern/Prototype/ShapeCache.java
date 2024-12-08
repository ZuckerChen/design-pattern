package CreationalPattern.Prototype;

/**
 * @author chenzhang
 * @date 2024/11/30 12:56
 */
public class ShapeCache {
    private static java.util.Map<String, Shape> shapeMap = new java.util.HashMap<>();
    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }
    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
        System.out.println("ShapeCache加载完成");
    }
}
