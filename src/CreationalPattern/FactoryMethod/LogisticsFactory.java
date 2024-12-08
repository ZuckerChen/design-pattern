package CreationalPattern.FactoryMethod;

/**
 * @author chenzhang
 * @date 2024/11/30 10:17
 */
public class LogisticsFactory {
    public static Logistics createLogistics(String type) {
        if (type.equals("road")) {
            return new RoadLogistics();
        } else if (type.equals("sea")) {
            return new SeaLogistics();
        }
        return null;
    }
}
