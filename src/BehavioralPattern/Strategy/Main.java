package BehavioralPattern.Strategy;

/**
 * @author chenzhang
 * @date 2024/12/8 13:35
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 它能让你定义一系列算法， 并将每种算法分别放入独立的类中， 以使算法的对象能够相互替换。
         * 环境（Context）：维护一个对策略对象的引用，负责将客户端请求委派给具体的策略对象执行。环境类可以通过依赖注入、简单工厂等方式来获取具体策略对象。
         * 抽象策略（Abstract Strategy）：定义了策略对象的公共接口或抽象类，规定了具体策略类必须实现的方法。
         * 具体策略（Concrete Strategy）：实现了抽象策略定义的接口或抽象类，包含了具体的算法实现。
         */
        Context context = new Context(new AddStrategy());
        int result = context.executeStrategy(1,2);
        System.out.println(result);

        context = new Context(new SubtractStrategy());
        result = context.executeStrategy(1,2);
        System.out.println(result);

        context = new Context(new MultiplyStrategy());
        result = context.executeStrategy(1,2);
        System.out.println(result);

    }
}
