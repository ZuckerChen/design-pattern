package BehavioralPattern.Visitor;

/**
 * @author chenzhang
 * @date 2024/12/8 13:44
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 它能将算法与其所作用的对象隔离开来。
         *
         * 场景：原对象结构稳定，需要在上面定义新的操作时，如生成报表等
         *
         * 访问者（Visitor）：定义了访问元素的接口。
         * 具体访问者（Concrete Visitor）：实现访问者接口，提供对每个具体元素类的访问和相应操作。
         * 元素（Element）：定义了一个接受访问者的方法。
         * 具体元素（Concrete Element）：实现元素接口，提供一个accept方法，允许访问者访问并操作。
         * 对象结构（Object Structure）（可选）：定义了如何组装具体元素，如一个组合类。
         * 客户端（Client）（可选）：使用访问者模式对对象结构进行操作。
         */


        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());

    }
}
