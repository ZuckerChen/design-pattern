package BehavioralPattern.ChainOfCommand;

/**
 * @author chenzhang
 * @date 2024/12/8 10:49
 */
public class Main {
    public static void main(String[] args)
    {
        /**
         * 抽象处理者（Handler）:定义一个处理请求的接口，通常包含一个处理请求的方法（如 handleRequest）和一个指向下一个处理者的引用（后继者）。
         * 具体处理者（ConcreteHandler）:实现了抽象处理者接口，负责处理请求。如果能够处理该请求，则直接处理；否则，将请求传递给下一个处理者。
         * 客户端（Client）:创建处理者对象，并将它们连接成一条责任链。通常，客户端只需要将请求发送给责任链的第一个处理者，无需关心请求的具体处理过程。
         */
        AbstractLogger loggerChain = getChainOfLoggers();
        loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
        loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
        loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
    }


    private static AbstractLogger getChainOfLoggers()
    {
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }
}
