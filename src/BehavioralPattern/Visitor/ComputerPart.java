package BehavioralPattern.Visitor;

/**
 * @author chenzhang
 * @date 2024/12/8 13:48
 */
public interface ComputerPart {
    void accept(ComputerPartVisitor computerPartVisitor);
}
