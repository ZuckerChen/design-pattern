package StructuralPattern.FlyWeight;

import java.util.HashMap;

/**
 * @author chenzhang
 * @date 2024/11/30 14:40
 */
public class ShapeFactory {
    private static final HashMap<String,Shape> circleMap = new HashMap<>();

    public static Shape getCircle(String color)
    {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null)
        {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        return circle;
    }
}
