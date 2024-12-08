package BehavioralPattern.Observer;

/**
 * @author chenzhang
 * @date 2024/12/8 13:16
 */
public class BinaryObserver extends Observer{
    public BinaryObserver(Subject subject)
    {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    void update() {
        System.out.println("Binary String: " + Integer.toBinaryString(subject.getState()));
    }
}
