package BehavioralPattern.Visitor;

/**
 * @author chenzhang
 * @date 2024/12/8 13:50
 */
public class Monitor implements ComputerPart{
    public void accept(ComputerPartVisitor computerPartVisitor)
    {
        computerPartVisitor.visit(this);
    }
}
