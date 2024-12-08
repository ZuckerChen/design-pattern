package BehavioralPattern.Command;

/**
 * @author chenzhang
 * @date 2024/12/8 11:15
 */
public class BuyStockCommand implements OrderCommand{
    Stock stock;
    @Override
    public void execute() {
        stock.buy();
    }
    public BuyStockCommand(Stock stock)
    {
        this.stock = stock;
    }
}
