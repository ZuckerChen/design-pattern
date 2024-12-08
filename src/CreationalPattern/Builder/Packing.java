package CreationalPattern.Builder;

/**
 * @author chenzhang
 * @date 2024/11/30 11:27
 */
public interface Packing {
    public String pack();
}
class Wrapper implements Packing {
    public String pack() {
        return "Wrapper";
    }
}
class Bottle implements Packing {
    public String pack() {
        return "Bottle";
    }
}
