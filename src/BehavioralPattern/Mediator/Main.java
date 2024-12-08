package BehavioralPattern.Mediator;

/**
 * @author chenzhang
 * @date 2024/12/8 11:51
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 能让你减少对象之间混乱无序的依赖关系。 该模式会限制对象之间的直接交互， 迫使它们通过一个中介者对象进行合作。
         */
        ConcreteMediator mediator = new ConcreteMediator();
        ComponentA componentA = new ComponentA(mediator);
        ComponentB componentB = new ComponentB(mediator);
        mediator.setComponentA(componentA);
        mediator.setComponentB(componentB);

        componentA.send("Hi! ComponentA");
        componentB.send("Hello! ComponentB");
    }
}
