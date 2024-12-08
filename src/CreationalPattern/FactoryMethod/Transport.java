package CreationalPattern.FactoryMethod;

/**
 * @author chenzhang
 * @date 2024/11/30 09:58
 */
public interface Transport {
    void deliver();
}

class Truck implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by Truck");
    }
}

class Ship implements Transport{
    @Override
    public void deliver() {
        System.out.println("Deliver by Ship");
    }
}