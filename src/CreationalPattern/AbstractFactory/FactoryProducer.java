package CreationalPattern.AbstractFactory;

/**
 * @author chenzhang
 * @date 2024/11/30 11:04
 */
public class FactoryProducer {
    public static AbstractFactroy getFactory(String choice) {
        if (choice.equalsIgnoreCase("shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("color")) {
            return new ColorFactory();
        }
        return null;
    }
}
