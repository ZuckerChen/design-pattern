package BehavioralPattern.Observer;

/**
 * @author chenzhang
 * @date 2024/12/8 13:15
 */
public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
