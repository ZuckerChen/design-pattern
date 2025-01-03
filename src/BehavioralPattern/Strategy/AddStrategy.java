package BehavioralPattern.Strategy;

/**
 * @author chenzhang
 * @date 2024/12/8 13:37
 */
public class AddStrategy implements Strategy{
    @Override
    public int doOperation(int num1, int num2) {
        return num1 + num2;
    }
}
