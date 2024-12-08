package BehavioralPattern.Mediator;

/**
 * @author chenzhang
 * @date 2024/12/8 11:49
 */
public class ComponentA extends Component{
    public ComponentA(Mediator mediator) {
        super(mediator);
    }

    @Override
    public void send(String message) {
        mediator.notify(message, this);
    }

    @Override
    public void notify(String message) {
        System.out.println("Component A send message: " + message);
    }
}
