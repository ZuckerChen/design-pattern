package BehavioralPattern.Observer;

/**
 * @author chenzhang
 * @date 2024/12/8 13:15
 */
public class Subject {
    private int state;
    private Observer[] observers = new Observer[MAX_OBSERVERS];
    private int observerCount = 0;
    private static final int MAX_OBSERVERS = 10;
    public void attach(Observer observer)
    {
        if (observerCount < MAX_OBSERVERS)
            observers[observerCount++] = observer;
    }
    public int getState()
    {
        return state;
    }
    public void setState(int state)
    {
        this.state = state;
        notifyAllObservers();
    }
    private void notifyAllObservers()
    {
        for (int i = 0; i < observerCount; i++)
            observers[i].update();
    }
}
