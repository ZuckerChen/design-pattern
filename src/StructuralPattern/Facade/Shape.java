package StructuralPattern.Facade;

/**
 * @author chenzhang
 * @date 2024/11/30 14:33
 */
public interface Shape {
    void draw();
}


class Rectangle implements Shape {
    public void draw()
    {
        System.out.println("Rectangle::draw()");
    }
}

class Circle implements Shape {
    public void draw()
    {
        System.out.println("Circle::draw()");
    }
}

class Square implements Shape {
    public void draw()
    {
        System.out.println("Square::draw()");
    }
}
