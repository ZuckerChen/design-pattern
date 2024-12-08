package StructuralPattern.Bridge;

/**
 * @author chenzhang
 * @date 2024/11/30 13:24
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 将抽象和实现分离，使它们可以独立变化
         *
         * 抽象（Abstraction）：定义抽象接口，通常包含对实现接口的引用。
         * 扩展抽象（Refined Abstraction）：对抽象的扩展，可以是抽象类的子类或具体实现类。
         * 实现（Implementor）：定义实现接口，提供基本操作的接口。
         * 具体实现（Concrete Implementor）：实现实现接口的具体类。
         */

        Shape redCircle = new Circle(100,100,10,new RedCircle());
        Shape greenCircle = new Circle(100,100,10,new GreenCircle());
        redCircle.draw();
        greenCircle.draw();
    }
}
