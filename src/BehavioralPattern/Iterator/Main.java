package BehavioralPattern.Iterator;

/**
 * @author chenzhang
 * @date 2024/12/8 11:26
 */
public class Main {
    public static void main(String[] args) {
        /**
         * 让你能在不暴露集合底层表现形式 （列表、 栈和树等） 的情况下遍历集合中所有的元素。
         * 迭代器接口（Iterator）：定义了访问和遍历聚合对象中各个元素的方法，通常包括获取下一个元素、判断是否还有元素、获取当前位置等方法。
         * 具体迭代器（Concrete Iterator）：实现了迭代器接口，负责对聚合对象进行遍历和访问，同时记录遍历的当前位置。
         * 聚合对象接口（Aggregate）：定义了创建迭代器对象的接口，通常包括一个工厂方法用于创建迭代器对象。
         * 具体聚合对象（Concrete Aggregate）：实现了聚合对象接口，负责创建具体的迭代器对象，并提供需要遍历的数据。
         */

        NameRepository nameRepository = new NameRepository();
        for (Iterator iter = nameRepository.getIterator(); iter.hasNext(); ) {
            String name = (String) iter.next();
            System.out.println("Name : " + name);
        }
    }
}
