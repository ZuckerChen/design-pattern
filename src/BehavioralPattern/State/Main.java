package BehavioralPattern.State;

/**
 * @author chenzhang
 * @date 2024/12/8 13:23
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 在一个对象的内部状态变化时改变其行为， 使其看上去就像改变了自身所属的类一样。
         * 上下文（Context）：定义了客户感兴趣的接口，并维护一个当前状态对象的引用。上下文可以通过状态对象来委托处理状态相关的行为。
         * 状态（State）：定义了一个接口，用于封装与上下文相关的一个状态的行为。
         * 具体状态（Concrete State）：实现了状态接口，负责处理与该状态相关的行为。具体状态对象通常会在内部维护一个对上下文对象的引用，以便根据不同的条件切换到不同的状态。
         */
        Context context = new Context();

        StartState state = new StartState();
        state.doAction(context);
        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);
        System.out.println(context.getState().toString());

    }
}
