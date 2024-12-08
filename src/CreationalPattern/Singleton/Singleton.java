package CreationalPattern.Singleton;

/**
 * @author chenzhang
 * @date 2024/11/30 11:39
 */
public class Singleton {

}

/**
 * 懒汉式-线程不安全
 */
class SingletonLazyUnSafe {
    private static SingletonLazyUnSafe instance;
    private SingletonLazyUnSafe (){}

    public static SingletonLazyUnSafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazyUnSafe();
        }
        return instance;
    }
}

/**
 * 懒汉式-线程安全
 */
class SingletonLazySafe {
    private static SingletonLazySafe instance;
    private SingletonLazySafe (){}
    public static synchronized SingletonLazySafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazySafe();
        }
        return instance;
    }
}

/**
 * 饿汉式
 */
class SingletonEager {
    private static SingletonEager instance = new SingletonEager();
    private SingletonEager (){}
    public static SingletonEager getInstance() {
        return instance;
    }
}

/**
 * 双重校验锁
 */
class SingletonDoubleCheck {
    private volatile static SingletonDoubleCheck instance;
    private SingletonDoubleCheck (){}
    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
/**
 * 静态内部类
 */
class SingletonStaticInner {
    private SingletonStaticInner (){}
    private static class SingletonHolder {
        private static final SingletonStaticInner instance = new SingletonStaticInner();
    }
    public static SingletonStaticInner getInstance() {
        return SingletonHolder.instance;
    }
}
/**
 * 枚举
 */
enum SingletonEnum {
    INSTANCE;
    public void doSomething() {
        System.out.println("Doing something...");
    }
}