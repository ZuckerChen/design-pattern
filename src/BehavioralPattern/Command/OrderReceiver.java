package BehavioralPattern.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * @author chenzhang
 * @date 2024/12/8 11:17
 */
public class OrderReceiver {

    private List<OrderCommand> orders = new ArrayList<>();


    public void takeOrder(OrderCommand command)
    {
        orders.add(command);
    }
    public void placeOrders()
    {
        for (OrderCommand order : orders) {
            order.execute();
        }
        orders.clear();
    }
}
