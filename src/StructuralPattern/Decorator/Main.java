package StructuralPattern.Decorator;

/**
 * @author chenzhang
 * @date 2024/11/30 14:05
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 动态地给一个对象添加额外的职责，同时不改变其结构。装饰器模式提供了一种灵活的替代继承方式来扩展功能。
         *
         * 抽象组件（Component）：定义了原始对象和装饰器对象的公共接口或抽象类，可以是具体组件类的父类或接口。
         * 具体组件（Concrete Component）：是被装饰的原始对象，它定义了需要添加新功能的对象。
         * 抽象装饰器（Decorator）：继承自抽象组件，它包含了一个抽象组件对象，并定义了与抽象组件相同的接口，同时可以通过组合方式持有其他装饰器对象。
         * 具体装饰器（Concrete Decorator）：实现了抽象装饰器的接口，负责向抽象组件添加新的功能。具体装饰器通常会在调用原始对象的方法之前或之后执行自己的操作。
         */

        Circle circle = new Circle();
        RedShapeDecorator redCircle = new RedShapeDecorator(new Circle());
        RedShapeDecorator redRectangle = new RedShapeDecorator(new Rectangle());

        circle.draw();
        redCircle.draw();
        redRectangle.draw();
    }
}
