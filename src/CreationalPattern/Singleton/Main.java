package CreationalPattern.Singleton;

/**
 * @author chenzhang
 * @date 2024/11/30 11:52
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 私有构造
         * 私有属性
         * 公开构建方法
         */

        SingletonEnum instance = SingletonEnum.INSTANCE;
        instance.doSomething();
    }
}
