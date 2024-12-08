package BehavioralPattern.Memento;

/**
 * @author chenzhang
 * @date 2024/12/8 13:02
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 允许在不暴露对象实现细节的情况下保存和恢复对象之前的状态。
         * 备忘录（Memento）：负责存储原发器对象的内部状态。备忘录可以保持原发器的状态的一部分或全部信息。
         * 原发器（Originator）：创建一个备忘录对象，并且可以使用备忘录对象恢复自身的内部状态。原发器通常会在需要保存状态的时候创建备忘录对象，并在需要恢复状态的时候使用备忘录对象。
         * 负责人（Caretaker）：负责保存备忘录对象，但是不对备忘录对象进行操作或检查。负责人只能将备忘录传递给其他对象。
         */
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();
        originator.setState("State #1");
        originator.setState("State #2");

        careTaker.add(originator.createMemento());
        originator.setState("State #3");
        careTaker.add(originator.createMemento());
        originator.setState("State #4");
        System.out.println("当前状态：" + originator.getState());
        originator.restoreMemento(careTaker.get(0));
        System.out.println("状态1：" + originator.getState());
        originator.restoreMemento(careTaker.get(1));
        System.out.println("状态2：" + originator.getState());

    }
}
