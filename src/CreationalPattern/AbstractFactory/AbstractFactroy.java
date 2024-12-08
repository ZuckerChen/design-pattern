package CreationalPattern.AbstractFactory;

/**
 * @author chenzhang
 * @date 2024/11/30 11:00
 */
public abstract class AbstractFactroy {
    abstract Shape getShape(String shape);
    abstract Color getColor(String color);
}
class ShapeFactory extends AbstractFactroy {
    @Override
    Shape getShape(String shape) {
        if (shape.equals("circle")) {
            return new Circle();
        } else if (shape.equals("rectangle")) {
            return new Rectangle();
        } else if (shape.equals("square")) {
            return new Square();
        }
        return null;
    }

    @Override
    Color getColor(String color) {
        return null;
    }
}

class ColorFactory extends AbstractFactroy {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {
        if (color.equals("red")) {
            return new Red();
        } else if (color.equals("green")) {
            return new Green();
        } else if (color.equals("blue")) {
            return new Blue();
        }
        return null;
    }
}

