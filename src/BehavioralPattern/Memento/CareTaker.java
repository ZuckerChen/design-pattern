package BehavioralPattern.Memento;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenzhang
 * @date 2024/12/8 13:05
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<>();
    public void add(Memento state)
    {
        mementoList.add(state);
    }
    public Memento get(int index)
    {
        return mementoList.get(index);
    }
}
