package CreationalPattern.AbstractFactory;

/**
 * @author chenzhang
 * @date 2024/11/30 11:02
 */
public interface Color {
    void fill();
}
class Red implements Color {
    public void fill()
    {
        System.out.println("Inside Red::fill() method.");
    }
}
class Blue implements Color {
    public void fill()
    {
        System.out.println("Inside Blue::fill() method.");
    }
}
class Green implements Color {
    public void fill()
    {
        System.out.println("Inside Green::fill() method.");
    }
}
