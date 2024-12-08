package BehavioralPattern.ChainOfCommand;

/**
 * @author chenzhang
 * @date 2024/12/8 10:48
 */
public class ConsoleLogger extends AbstractLogger{
    public ConsoleLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("Standard Console::Logger: " + message);
    }
}
