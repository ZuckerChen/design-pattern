package BehavioralPattern.Observer;

/**
 * @author chenzhang
 * @date 2024/12/8 13:18
 */
public class HexaObserver extends Observer{
    public HexaObserver(Subject subject)
    {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    void update() {
        System.out.println("Hex String: " + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
