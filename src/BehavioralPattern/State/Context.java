package BehavioralPattern.State;

/**
 * @author chenzhang
 * @date 2024/12/8 13:24
 */
public class Context {
    private State state;

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
