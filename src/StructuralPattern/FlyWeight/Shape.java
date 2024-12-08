package StructuralPattern.FlyWeight;

/**
 * @author chenzhang
 * @date 2024/11/30 14:38
 */
public interface Shape {
    void draw();
}

class Circle implements Shape {
    String color;//包含不变的、 可在许多对象中重复使用的数据的成员变量。
    private int x, y, radius;//外在状态： 包含每个对象各自不同的情景数据的成员变量

    public Circle(String color)
    {
        this.color = color;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void draw()
    {
        System.out.println("Circle: Draw() [Color : green, x : " + x + ", y : " + y + ", radius :" + radius);
    }
}
