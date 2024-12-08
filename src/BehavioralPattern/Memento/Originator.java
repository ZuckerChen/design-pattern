package BehavioralPattern.Memento;

/**
 * @author chenzhang
 * @date 2024/12/8 13:04
 */
public class Originator {
    private String state;
    public Memento createMemento()
    {
        return new Memento(state);
    }
    public void restoreMemento(Memento memento)
    {
        state = memento.getState();
    }
    public void setState(String state)
    {
        this.state = state;
    }
    public String getState()
    {
        return state;
    }
}
