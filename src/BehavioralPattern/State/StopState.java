package BehavioralPattern.State;

/**
 * @author chenzhang
 * @date 2024/12/8 13:26
 */
public class StopState implements State{
    @Override
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }
}
