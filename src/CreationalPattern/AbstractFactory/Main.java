package CreationalPattern.AbstractFactory;

/**
 * @author chenzhang
 * @date 2024/11/30 11:08
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactroy abstractFactroy = FactoryProducer.getFactory("shape");
        if (abstractFactroy == null) {
            return;
        }
        Shape shape = abstractFactroy.getShape("circle");
        shape.draw();
        /**
         * 抽象工厂：声明了一组用于创建产品对象的方法，每个方法对应一种产品类型。抽象工厂可以是接口或抽象类。
         * 具体工厂：实现了抽象工厂接口，负责创建具体产品对象的实例。
         * 抽象产品：定义了一组产品对象的共同接口或抽象类，描述了产品对象的公共方法。
         * 具体产品：实现了抽象产品接口，定义了具体产品的特定行为和属性
         *
         * 缺点：扩展产品非常麻烦
         */
    }
}
