package BehavioralPattern.TempletMethod;

/**
 * @author chenzhang
 * @date 2024/12/8 13:41
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 它在超类中定义了一个算法的框架， 允许子类在不修改结构的情况下重写算法的特定步骤。
         * 场景：事务方法等
         * 抽象父类（Abstract Class）：定义了模板方法和一些抽象方法或具体方法。
         * 具体子类（Concrete Classes）：继承自抽象父类，并实现抽象方法。
         * 钩子方法（Hook Method）（可选）：在抽象父类中定义，可以被子类重写，以影响模板方法的行为。
         * 客户端（Client）（可选）：使用抽象父类和具体子类，无需关心模板方法的细节。
         */

        Cricket game = new Cricket();
        game.play();
        System.out.println();
        Football game1 = new Football();
        game1.play();
        System.out.println();
    }
}
