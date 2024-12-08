package BehavioralPattern.Visitor;

/**
 * @author chenzhang
 * @date 2024/12/8 13:49
 */
public class Mouse implements ComputerPart{
    public void accept(ComputerPartVisitor computerPartVisitor)
    {
        computerPartVisitor.visit(this);
    }
}
