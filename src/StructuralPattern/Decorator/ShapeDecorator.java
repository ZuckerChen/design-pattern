package StructuralPattern.Decorator;/**
 * @author chenzhang
 * @date 2024/11/30 14:17
 */public class ShapeDecorator implements Shape{
     Shape shape;
     public ShapeDecorator(Shape decoratedShape) {
         this.shape = decoratedShape;
     }
    @Override
    public void draw() {
         shape.draw();
    }
}

class RedShapeDecorator extends ShapeDecorator{
    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
    }
    @Override
    public void draw() {
        super.draw();
        setRedBorder(shape);
    }
    private void setRedBorder(Shape decoratedShape) {
        System.out.println("Border Color: Red");
    }
}