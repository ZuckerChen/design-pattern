package StructuralPattern.FlyWeight;

/**
 * @author chenzhang
 * @date 2024/11/30 14:36
 */
public class Main {
    private static final String colors[] =
        { "Red", "Green", "Blue", "White", "Black" };
    public static void main(String[] args) {
        /**
         * 通过共享对象来减少创建大量相似对象时的内存消耗
         *
         * 享元工厂（Flyweight Factory）:负责创建和管理享元对象，通常包含一个池（缓存）用于存储和复用已经创建的享元对象。
         * 具体享元（Concrete Flyweight）:实现了抽象享元接口，包含了内部状态和外部状态。内部状态是可以被共享的，而外部状态则由客户端传递。
         * 抽象享元（Flyweight）:定义了具体享元和非共享享元的接口，通常包含了设置外部状态的方法。
         * 客户端（Client）:使用享元工厂获取享元对象，并通过设置外部状态来操作享元对象。客户端通常不需要关心享元对象的具体实现。
         */

        for(int i=0; i < 20; ++i) {
            Circle circle =
                (Circle)ShapeFactory.getCircle(getRandomColor());
            circle.setX(getRandomX());
            circle.setY(getRandomY());
            circle.setRadius(100);
            circle.draw();
        }
    }

    private static String getRandomColor() {
        return colors[(int)(Math.random()*colors.length)];
    }
    private static int getRandomX() {
        return (int)(Math.random()*100 );
    }
    private static int getRandomY() {
        return (int)(Math.random()*100);
    }
}
