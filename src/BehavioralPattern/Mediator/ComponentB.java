package BehavioralPattern.Mediator;

/**
 * @author chenzhang
 * @date 2024/12/8 11:50
 */
public class ComponentB extends Component{

    public ComponentB(Mediator mediator) {
        super(mediator);
    }

    public void send(String message) {
        mediator.notify(message, this);
    }

    @Override
    public void notify(String message) {
        System.out.println("Component B send message: " + message);
    }
}
