package BehavioralPattern.Visitor;

/**
 * @author chenzhang
 * @date 2024/12/8 13:48
 */
public class Keyboard implements ComputerPart{
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
