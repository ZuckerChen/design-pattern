package StructuralPattern.Composite;

/**
 * @author chenzhang
 * @date 2024/11/30 13:54
 */
public interface Graphic {
    void draw();
    void move(int x, int y);
}

class Dot implements Graphic{
    private int x, y;

    public Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void draw() {
        System.out.println("Dot");
    }
    public void move(int x, int y)
    {
        System.out.println("Dot move");
    }
}

class Circle implements Graphic{
    public Circle(int x, int y, int radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    private int x, y, radius;
    public void draw()
    {
        System.out.println("Circle");
    }
    public void move(int x, int y)
    {
        System.out.println("Circle move");
    }
}


