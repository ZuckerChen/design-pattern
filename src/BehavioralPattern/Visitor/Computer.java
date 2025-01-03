package BehavioralPattern.Visitor;

/**
 * @author chenzhang
 * @date 2024/12/8 13:50
 */
public class Computer implements ComputerPart{
    ComputerPart[] parts;

    public Computer()
    {
        parts = new ComputerPart[] {new Mouse(), new Keyboard(), new Monitor()};
    }

    public void accept(ComputerPartVisitor computerPartVisitor)
    {
        for (int i = 0; i < parts.length; i++)
        {
            parts[i].accept(computerPartVisitor);
        }
        computerPartVisitor.visit(this);
    }
}
