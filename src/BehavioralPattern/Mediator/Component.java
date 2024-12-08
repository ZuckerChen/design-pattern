package BehavioralPattern.Mediator;

/**
 * @author chenzhang
 * @date 2024/12/8 12:02
 */
public abstract class Component {
    protected Mediator mediator;

    public Component(Mediator mediator)
    {
        this.mediator = mediator;
    }
    public abstract void send(String message);
    public abstract void notify(String message);
    }
