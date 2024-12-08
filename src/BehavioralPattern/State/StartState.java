package BehavioralPattern.State;

/**
 * @author chenzhang
 * @date 2024/12/8 13:24
 */
public class StartState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in start state");
        context.setState(this);
    }
}
