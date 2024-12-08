package CreationalPattern.FactoryMethod;

/**
 * @author chenzhang
 * @date 2024/11/30 10:01
 */
public abstract class Logistics {
    abstract Transport createTransport();

    void planDelivery() {
        Transport transport = createTransport();
        transport.deliver();
    }
}

class RoadLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Truck();
    }
}

class SeaLogistics extends Logistics{
    @Override
    public Transport createTransport() {
        return new Ship();
    }
}
