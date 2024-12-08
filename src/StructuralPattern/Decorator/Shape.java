package StructuralPattern.Decorator;

/**
 * @author chenzhang
 * @date 2024/11/30 14:15
 */
public interface Shape {
    void draw();
}
class Circle implements Shape {
    public void draw(){
        System.out.println("Shape: Circle");
    }
}

class Rectangle implements Shape {
    public void draw(){
        System.out.println("Shape: Rectangle");
    }
}
