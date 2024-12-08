package BehavioralPattern.ChainOfCommand;

/**
 * @author chenzhang
 * @date 2024/12/8 10:49
 */
public class FileLogger extends AbstractLogger{
    public FileLogger(int level) {
        this.level = level;
    }
    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
