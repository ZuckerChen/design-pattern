package BehavioralPattern.Observer;

/**
 * @author chenzhang
 * @date 2024/12/8 13:18
 */
public class OctalObserver extends Observer{
    public OctalObserver(Subject subject)
    {
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    void update() {
        System.out.println("Octal String: " + Integer.toOctalString(subject.getState()));
    }
}
