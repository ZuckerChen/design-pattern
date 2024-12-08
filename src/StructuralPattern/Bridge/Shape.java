package StructuralPattern.Bridge;

/**
 * @author chenzhang
 * @date 2024/11/30 13:32
 */
public abstract class Shape {
    DrawAPI drawAPI;
    public Shape(DrawAPI drawAPI)
    {
        this.drawAPI = drawAPI;
    }
    public abstract void draw();
}

class Circle extends Shape {
    int x, y, radius;
    public Circle(int x, int y, int radius, DrawAPI drawAPI)
    {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void draw()
    {
        drawAPI.drawCircle(radius, x, y);
    }
}
