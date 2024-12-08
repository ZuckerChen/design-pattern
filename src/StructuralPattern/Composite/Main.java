package StructuralPattern.Composite;

/**
 * @author chenzhang
 * @date 2024/11/30 13:37
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 组合模式：将对象组合成树形结构以表示“部分-整体”的层次结构。组合模式使得用户对单个对象和组合对象的使用具有一致性。
         * 组件（Component）:定义了组合中所有对象的通用接口，可以是抽象类或接口。它声明了用于访问和管理子组件的方法，包括添加、删除、获取子组件等。
         * 叶子节点（Leaf）:表示组合中的叶子节点对象，叶子节点没有子节点。它实现了组件接口的方法，但通常不包含子组件。
         * 复合节点（Composite）:表示组合中的复合对象，复合节点可以包含子节点，可以是叶子节点，也可以是其他复合节点。它实现了组件接口的方法，包括管理子组件的方法。
         * 客户端（Client）:通过组件接口与组合结构进行交互，客户端不需要区分叶子节点和复合节点，可以一致地对待整体和部分。
         */

        CompositeGraphic graphic = new CompositeGraphic();

        graphic.add(new Dot(1, 2));
        graphic.add(new Dot(3, 4));
        graphic.add(new Circle(5, 6, 7));
        graphic.add(new Circle(8, 9, 10));
        graphic.draw();

    }
}
