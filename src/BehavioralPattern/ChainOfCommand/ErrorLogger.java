package BehavioralPattern.ChainOfCommand;

/**
 * @author chenzhang
 * @date 2024/12/8 10:48
 */
public class ErrorLogger extends AbstractLogger{
    public ErrorLogger(int level)
    {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Error Console::Logger: " + message);
    }
}
