package BehavioralPattern.Interpreter;

/**
 * @author chenzhang
 * @date 2024/12/8 11:20
 */
public class Mian {
    public static void main(String[] args) {
        /**
         * 定义一种语言的文法表示，并创建一个解释器，该解释器能够解释该语言中的句子。
         * 抽象表达式（Abstract Expression）：定义了解释器的抽象接口，声明了解释操作的方法，通常是一个抽象类或接口。
         * 终结符表达式（Terminal Expression）：实现了抽象表达式接口的终结符表达式类，用于表示语言中的终结符（如变量、常量等），并实现了对应的解释操作。
         * 非终结符表达式（Non-terminal Expression）：实现了抽象表达式接口的非终结符表达式类，用于表示语言中的非终结符（如句子、表达式等），并实现了对应的解释操作。
         * 上下文（Context）：包含解释器之外的一些全局信息，在解释过程中提供给解释器使用，通常用于存储变量的值、保存解释器的状态等。
         * 客户端（Client）：创建并配置具体的解释器对象，并将需要解释的表达式传递给解释器进行解释。
         */
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();
        System.out.println("John is male? " + isMale.interpret("John"));
        System.out.println("Julie is a married women? " + isMarriedWoman.interpret("Married Julie"));
    }


    public static Expression getMaleExpression() {
        Expression robert = new TerminalExpression("Robert");
        Expression john = new TerminalExpression("John");
        return new OrExpression(robert, john);
    }

    public static Expression getMarriedWomanExpression() {
        Expression julie = new TerminalExpression("Julie");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julie, married);
    }
}
