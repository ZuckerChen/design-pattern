package BehavioralPattern.Visitor;

/**
 * @author chenzhang
 * @date 2024/12/8 13:48
 */
public interface ComputerPartVisitor {
    void visit(Computer computer);
    void visit(Mouse mouse);
    void visit(Keyboard keyboard);
    void visit(Monitor monitor);
}
