package StructuralPattern.Facade;

/**
 * @author chenzhang
 * @date 2024/11/30 14:25
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 为一个复杂的子系统提供一个一致的高层接口
         *
         * 外观（Facade）:提供一个简化的接口，封装了系统的复杂性。外观模式的客户端通过与外观对象交互，而无需直接与系统的各个组件打交道。
         * 子系统（Subsystem）:由多个相互关联的类组成，负责系统的具体功能。外观对象通过调用这些子系统来完成客户端的请求。
         * 客户端（Client）:使用外观对象来与系统交互，而不需要了解系统内部的具体实现。
         */
        ShapeMaker shapeMaker = new ShapeMaker();
        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
