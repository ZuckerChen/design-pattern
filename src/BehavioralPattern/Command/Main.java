package BehavioralPattern.Command;

/**
 * @author chenzhang
 * @date 2024/12/8 10:57
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 请求封装成对象，解耦请求者和执行者，特别是需要对请求行为进行记录、撤销、重做等场景
         * 命令（Command）:定义了执行操作的接口，通常包含一个 execute 方法，用于调用具体的操作。
         * 具体命令（ConcreteCommand）:实现了命令接口，负责执行具体的操作。它通常包含了对接收者的引用，通过调用接收者的方法来完成请求的处理。
         * 接收者（Receiver）:知道如何执行与请求相关的操作，实际执行命令的对象。
         * 调用者/请求者（Invoker）:发送命令的对象，它包含了一个命令对象并能触发命令的执行。调用者并不直接处理请求，而是通过将请求传递给命令对象来实现。
         */

        Stock abcStock = new Stock();
        BuyStockCommand buyStockCommand = new BuyStockCommand(abcStock);
        SellStockCommand sellStockCommand = new SellStockCommand(abcStock);

        OrderReceiver orderReceiver = new OrderReceiver();
        orderReceiver.takeOrder(buyStockCommand);
        orderReceiver.takeOrder(sellStockCommand);

        orderReceiver.placeOrders();
    }
}
