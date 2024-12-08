package BehavioralPattern.Strategy;

/**
 * @author chenzhang
 * @date 2024/12/8 13:39
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy)
    {
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2)
    {
        return strategy.doOperation(num1, num2);
    }
}
