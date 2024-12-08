package BehavioralPattern.Strategy;

/**
 * @author chenzhang
 * @date 2024/12/8 13:38
 */
public class SubtractStrategy implements Strategy{
    public int doOperation(int num1, int num2)
    {
        return num1 - num2;
    }
}
