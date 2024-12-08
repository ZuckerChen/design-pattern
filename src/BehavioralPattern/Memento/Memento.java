package BehavioralPattern.Memento;

/**
 * @author chenzhang
 * @date 2024/12/8 13:04
 */
public class Memento {
    private String state;

    public Memento(String state)
    {
        this.state = state;
    }

    public String getState()
    {
        return state;
    }
}
