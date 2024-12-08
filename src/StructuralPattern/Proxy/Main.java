package StructuralPattern.Proxy;

/**
 * @author chenzhang
 * @date 2024/11/30 14:48
 */
public class Main {
    public static void main(String[] args) {

        /**
         * 让你能够提供对象的替代品或其占位符。 代理控制着对于原对象的访问， 并允许在将请求提交给对象前后进行一些处理。
         *
         * 抽象主题（Subject）:定义了真实主题和代理主题的共同接口，这样在任何使用真实主题的地方都可以使用代理主题。
         * 真实主题（Real Subject）:实现了抽象主题接口，是代理对象所代表的真实对象。客户端直接访问真实主题，但在某些情况下，可以通过代理主题来间接访问。
         * 代理（Proxy）:实现了抽象主题接口，并持有对真实主题的引用。代理主题通常在真实主题的基础上提供一些额外的功能，例如延迟加载、权限控制、日志记录等。
         * 客户端（Client）:使用抽象主题接口来操作真实主题或代理主题，不需要知道具体是哪一个实现类。
         */

        Image image = new ProxyImage("test_10mb.jpg");
        image.display();

        image.display();
    }
}
