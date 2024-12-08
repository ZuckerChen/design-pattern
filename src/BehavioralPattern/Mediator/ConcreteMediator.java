package BehavioralPattern.Mediator;

/**
 * @author chenzhang
 * @date 2024/12/8 11:51
 */
public class ConcreteMediator implements Mediator{
    private ComponentA componentA;
    private ComponentB componentB;

    public void setComponentA(ComponentA componentA) {
        this.componentA = componentA;
    }

    public void setComponentB(ComponentB componentB) {
        this.componentB = componentB;
    }

    @Override
    public void notify(String sender, Component component) {
        if (component == componentA) {
            componentB.notify(sender);
        } else {
            componentA.notify(sender);
        }
    }
}
