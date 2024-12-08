package BehavioralPattern.Mediator;

/**
 * @author chenzhang
 * @date 2024/12/8 11:42
 */
public interface Mediator {
    void notify(String sender, Component component);
}
