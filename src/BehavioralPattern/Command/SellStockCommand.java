package BehavioralPattern.Command;

/**
 * @author chenzhang
 * @date 2024/12/8 11:16
 */
public class SellStockCommand implements OrderCommand{
    private Stock stock;

    public void execute()
    {
        stock.sell();
    }

    public SellStockCommand(Stock stock)
    {
        this.stock = stock;
    }
}
